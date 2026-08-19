package threads;

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