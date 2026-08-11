class BankAccount {
    String accountHolderName;
    double balance;

    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void displayInfo() {
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    public SavingsAccount(String accountHolderName, double balance, double interestRate) {
        super(accountHolderName, balance);
        this.interestRate = interestRate;
    }

    public void displayInterest() {
        interestRate = balance * (interestRate / 100 );
        System.out.println("Interest Earned: " + interestRate);
    }
}

public class Main {
    public static void main(String[] args) {
        
        SavingsAccount s = new SavingsAccount("Rahul", 15000, 5);
        s.displayInfo();
        s.displayInterest();
    }
}