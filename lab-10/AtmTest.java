interface ATMService {
    void withdraw(double amount);

    void deposit(double amount);

    double checkBalance();
}

class DBBL implements ATMService {
    private double balance;

    public DBBL(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println(" Invalid amount!");
        } else if (amount > balance) {
            System.out.println(" Insufficient balance! Current: " + balance + " BDT");
        } else {
            balance -= amount;
            System.out.println(" Withdrawn: " + amount + " BDT → Balance: " + balance + " BDT");
        }
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println(" Deposit amount must be positive!");
        } else {
            balance += amount;
            System.out.println(" Deposited: " + amount + " BDT → Balance: " + balance + " BDT");
        }
    }

    @Override
    public double checkBalance() {
        return balance;
    }
}

public class AtmTest {
    public static void main(String[] args) {
        System.out.println("=====================================");
        System.out.println("  Interface Implementation (DBBL ATM)");
        System.out.println("=====================================\n");
        DBBL dbblAccount = new DBBL(2000.0);
        System.out.println("Intialized balance: " + dbblAccount.checkBalance() + " BDT\n");
        dbblAccount.deposit(1500.0);
        dbblAccount.withdraw(800.0);
        dbblAccount.withdraw(5000.0);
        dbblAccount.deposit(-200);
        System.out.println("\nFinal Balance: " + dbblAccount.checkBalance() + " BDT");
    }
}