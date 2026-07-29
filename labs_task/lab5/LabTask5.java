/*   Assignment - 1

class Student {
    int studentId;
    String studentName;
    String course;
    double marks;

    // Parameterized Constructor
    Student(int studentId, String studentName, String course, double marks) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.course = course;
        this.marks = marks;
    }

    // Display Student Details
    void displayDetails() {
        System.out.println("Student ID   : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Course       : " + course);
        System.out.println("Marks        : " + marks);
    }

    // Check Pass or Fail
    void isPassed() {
        if (marks >= 40) {
            System.out.println("Result       : Passed");
        } else {
            System.out.println("Result       : Failed");
        }
        System.out.println();
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Naresh Gupta", "MCA", 84);
        Student s2 = new Student(102, "Anushka Pal", "MBA", 77);
        Student s3 = new Student(103, "Prince Gupta", "M.Tech", 89);

        s1.displayDetails();
        s1.isPassed();

        s2.displayDetails();
        s2.isPassed();

        s3.displayDetails();
        s3.isPassed();
    }
}

*/

/* ==================================================================================================== */

/*   Assignment - 2

class BankAccount {
    long accountNumber;
    String accountHolderName;
    double balance;

    // Parameterized Constructor
    BankAccount(long accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Deposit Method
    void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " deposited successfully.");
    }

    // Withdraw Method
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient Balance.");
        }
    }

    // Display Balance
    void displayBalance() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Current Balance: " + balance);
        System.out.println();
    }
}

public class BankAccountSystem {
    public static void main(String[] args) {

        BankAccount acc1 =
                new BankAccount(1234567890L, "Anushka Pal", 47000);
        BankAccount acc2 =
                new BankAccount(9876543210L, "Naresh Gupta", 76000);

        // Transactions for Account 1
        acc1.deposit(20000);
        acc1.withdraw(15000);

        // Transactions for Account 2
        acc2.deposit(10000);
        acc2.withdraw(19500);

        // Display Final Balances
        System.out.println("\nFinal Account Details:");
        acc1.displayBalance();
        acc2.displayBalance();
    }
}

*/

