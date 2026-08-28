package threads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class StudentResultTask implements Callable<Double> {
    String name;
    Map<String, Double> marks;

    public StudentResultTask(String name, Map<String,Double> marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    @Override
    public Double call() {
        double sum = 0.0;
        int count = marks.size();
        for (String sub: marks.keySet()) {
            sum += marks.get(sub);
        }
        return sum/count;
    }
}

public class StudentResultExecutor {
    public static void main(String[] args) {
        Map<String, Double> marks1 = new HashMap<>();
        marks1.put("Java", 87.5);
        marks1.put("MySQL", 79.55);
        marks1.put("Web Technologies", 81.6);
        StudentResultTask task1 = new StudentResultTask("Naresh", marks1);

        Map<String, Double> marks2 = new HashMap<>();
        marks2.put("Java", 77.35);
        marks2.put("MySQL", 75.25);
        marks2.put("Web Technologies", 83.4);
        StudentResultTask task2 = new StudentResultTask("Vijay", marks2);

        Map<String, Double> marks3 = new HashMap<>();
        marks3.put("Java", 67.45);
        marks3.put("MySQL", 59.25);
        marks3.put("Web Technologies", 71.3);
        StudentResultTask task3 = new StudentResultTask("Prince", marks3);

        Map<String, Double> marks4 = new HashMap<>();
        marks4.put("Java", 57.45);
        marks4.put("MySQL", 49.25);
        marks4.put("Web Technologies", 61.3);
        StudentResultTask task4 = new StudentResultTask("Rohit", marks4);

        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<Double> res1 = service.submit(task1);
        Future<Double> res2 = service.submit(task2);
        Future<Double> res3 = service.submit(task3);
        Future<Double> res4 = service.submit(task4);

        try {
            System.out.println(task1.getName()+" result is: " + res1.get());
            System.out.println(task2.getName()+" result is: " + res2.get());
            System.out.println(task3.getName()+" result is: " + res3.get());
            System.out.println(task4.getName()+" result is: " + res4.get());
        } catch (InterruptedException | ExecutionException ex) {
            ex.printStackTrace();
        }
    }
}