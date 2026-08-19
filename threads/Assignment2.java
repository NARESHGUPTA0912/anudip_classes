package threads;

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