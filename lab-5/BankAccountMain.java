class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;
    static String bankName = "Sonali Bank";

    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void displayAccountInfo() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    static void showBankName() {
        System.out.println("Bank Name: " + bankName);
    }
}

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(251046, "Atik", 500);
        BankAccount acc2 = new BankAccount(251018, "Atif", 5000);

        acc1.displayAccountInfo();
        System.out.println();
        acc2.displayAccountInfo();
        BankAccount.showBankName();
    }
}
