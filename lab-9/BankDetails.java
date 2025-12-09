class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private String bankName;
    private String branchName;
    private double balance;

    public void setAccountHolder(String h) {
        accountHolder = h;
    }

    public void setAccountNumber(String num) {
        accountNumber = num;
    }

    public void setBankName(String bank) {
        bankName = bank;
    }

    public void setBranchName(String branch) {
        branchName = branch;
    }

    public void setBalance(double b) {
        balance = b;
    }

    public void showAccountDetails() {
        System.out.println("---------------------------------------------------------------");
        System.out.println("            ACCOUNT DETAILS ");
        System.out.println("---------------------------------------------------------------");
        System.out.println("Account Holder   : " + accountHolder);
        System.out.println("Account Number   : " + accountNumber);
        System.out.println("Bank             : " + bankName);
        System.out.println("Branch           : " + branchName);
        System.out.println();
        System.out.println(" Current Balance: " + balance);
    }

    public void showTransaction(String date, String txnId, String type, double amount) {
        System.out.println("---------------------------------------------------------------");
        System.out.println("            TRANSACTION DETAILS ");
        System.out.println("---------------------------------------------------------------");
        System.out.printf("| %s | %s | %s | %, .2f BDT |\n", date, txnId, type, amount);
    }
}

public class BankDetails {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.setAccountHolder("Md. Atikur Rahaman");
        acc.setAccountNumber("2025 1225 1046");
        acc.setBankName("Islami Bank Bangladesh PLC");
        acc.setBranchName("Chawkbazar Branch");
        acc.setBalance(12540.00);
        acc.showAccountDetails();
        acc.showTransaction("06-Dec-2025", "IBBL-TXN-98421356", "Deposit", 12540.00);
    }
}
