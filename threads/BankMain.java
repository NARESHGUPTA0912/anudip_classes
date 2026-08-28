// using synchronization
// class Bank {
//     int balance;
//     Bank(int balance) {
//         this.balance = balance;
//     }
//     public void withdraw(int amount) {      // we can use synchronized keyword at method also
//         synchronized(Bank.class){
//         System.out.println(Thread.currentThread().getName()+" is checking balance.");
//             if(balance >= amount) {
//                 System.out.println(Thread.currentThread().getName()+" withdraw " + amount + " rupees.");
//                 balance -= amount;
//             } else {
//                 System.out.println("Insufficient Balance.");
//             }
//         }
//     }

//     public int getBalance() {
//         return balance;
//     }
// }

// using AtomicInteger
import java.util.concurrent.atomic.AtomicInteger;

class Bank {
    private final AtomicInteger balance;

    Bank(int balance) {
        this.balance = new AtomicInteger(balance);
    }

    public void withdraw(int amount) {

        while (true) {
            int currentBalance = balance.get();

            System.out.println(
                Thread.currentThread().getName()
                + " is checking balance."
            );

            if (currentBalance < amount) {
                System.out.println("Insufficient Balance.");
                return;
            }

            int newBalance = currentBalance - amount;

            if (balance.compareAndSet(currentBalance, newBalance)) {
                System.out.println(
                    Thread.currentThread().getName()
                    + " withdraw " + amount + " rupees."
                );
                return;
            }
        }
    }

    public int getBalance() {
        return balance.get();
    }
}

public class BankMain {
    public static void main(String[] args) {
        try {
            Bank b = new Bank(1000);
            Thread t1 = new Thread(()->{
                b.withdraw(700);
            });
            Thread t2 = new Thread(()->{
                b.withdraw(700);
            });
            t1.start();     t2.start();
            t1.join();      t2.join();
            System.out.println("Final Balance: " + b.getBalance());
        } catch (InterruptedException ex) {
            System.getLogger(BankMain.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
}