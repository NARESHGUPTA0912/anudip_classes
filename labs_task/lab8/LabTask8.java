package labs_task.lab8;

/**
 // Assignment 1 – Prime Number Calculation Using Thread

class PrimeThread extends Thread {

    private int start;
    private int end;
    private int count = 0;

    PrimeThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getCount() {
        return count;
    }

    private boolean isPrime(int num) {
        if (num < 2)
            return false;
        if (num == 2 || num == 3)
            return true;
        if (num % 2 == 0)
            return false;
        for (int i = 3; i * i <= num; i += 2) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " checking numbers from " + start + " to " + end);
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println(Thread.currentThread().getName() + " found " + count + " prime numbers.");
    }
}

public class Assignment1 {
    public static void main(String[] args) {

        PrimeThread t1 = new PrimeThread(1, 50);
        PrimeThread t2 = new PrimeThread(51, 100);

        t1.setName("Thread-1");
        t2.setName("Thread-2");

        t1.start();     t2.start();

        try {
            t1.join();      t2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        int total = t1.getCount() + t2.getCount();

        System.out.println("Total prime numbers = " + total);
    }
}
 */



/**
 // Assignment 2 – Matrix Row Sum Using Runnable

class RowSumTask implements Runnable {

    private int[] row;
    private int rowNumber;
    private int sum;

    RowSumTask(int[] row, int rowNumber) {
        this.row = row;
        this.rowNumber = rowNumber;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public void run() {
        sum = 0;
        for (int value : row) {
            sum += value;
        }
        System.out.println("Row " + rowNumber + " Sum = " + sum);
    }
}

public class Assignment2 {
    public static void main(String[] args) {

        int[][] matrix = {
            {10, 20, 30, 40},
            {5, 15, 25, 35},
            {2, 4, 6, 8},
            {100, 200, 300, 400}
        };

        // Creating the tasks
        RowSumTask task1 = new RowSumTask(matrix[0], 1);
        RowSumTask task2 = new RowSumTask(matrix[1], 2);
        RowSumTask task3 = new RowSumTask(matrix[2], 3);
        RowSumTask task4 = new RowSumTask(matrix[3], 4);

        // assigning the tasks
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        Thread t3 = new Thread(task3);
        Thread t4 = new Thread(task4);

        t1.start();     t2.start();
        t3.start();     t4.start();

        try {
            t1.join();      t2.join();
            t3.join();      t4.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        int total = task1.getSum()+task2.getSum()+task3.getSum()+task4.getSum();
        System.out.println("Total Sum = " + total);
    }
}
 */



/**
 // Assignment 3 – Student Average Calculator Using Runnable

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
*/
