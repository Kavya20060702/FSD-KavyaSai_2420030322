class BankAccount {

    protected double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }
    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {

    private double interestRate = 5.0;
    SavingsAccount(double balance) {
        super(balance);
    }

    void calculateInterest() {
        double interest = (balance * interestRate) / 100;
        System.out.println("Interest: " + interest);
        System.out.println("Total Balance after Interest: " + (balance + interest));
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {

        SavingsAccount account = new SavingsAccount(10000);

        account.displayBalance();  
        account.calculateInterest();   
    }
}
