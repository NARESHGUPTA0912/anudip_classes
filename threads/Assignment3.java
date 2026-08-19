package threads;

class StudentTask implements Runnable {

    private int[] marks;
    private int studentNumber;
    private int total;
    private double average;

    StudentTask(int[] marks, int studentNumber) {
        this.marks = marks;
        this.studentNumber = studentNumber;
    }

    public int getTotal() {
        return total;
    }

    public double getAverage() {
        return average;
    }

    @Override
    public void run() {
        total = 0;
        for (int mark : marks) {
            total += mark;
        }
        average = (double) total / marks.length;
        System.out.printf("Student %d Total = %d | Average = %.2f%n", studentNumber, total, average);
    }
}

public class Assignment3 {
    public static void main(String[] args) {

        int[][] marks = {
            {85, 90, 78, 88},
            {70, 65, 80, 75},
            {95, 92, 96, 94},
            {60, 72, 68, 70}
        };

        // creating task
        StudentTask s1 = new StudentTask(marks[0], 1);
        StudentTask s2 = new StudentTask(marks[1], 2);
        StudentTask s3 = new StudentTask(marks[2], 3);
        StudentTask s4 = new StudentTask(marks[3], 4);

        // assigning task
        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s2);
        Thread t3 = new Thread(s3);
        Thread t4 = new Thread(s4);

        t1.start();     t2.start();
        t3.start();     t4.start();

        try {
            t1.join();   t2.join();
            t3.join();   t4.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        int classTotal = s1.getTotal()+s2.getTotal()+s3.getTotal()+s4.getTotal();
        double classAverage = (double) classTotal / 16;
        System.out.println("Class Total = " + classTotal);
        System.out.printf("Class Average = %.2f%n", classAverage);
    }
}