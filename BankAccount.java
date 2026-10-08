import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public double checkBalance() {
        return balance;
    }

    
    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String accNum = sc.nextLine();
        String name = sc.nextLine();
        double initialBalance = sc.nextDouble();

        BankAccount account = new BankAccount(accNum, name, initialBalance);

        double depositAmt = sc.nextDouble();
        account.deposit(depositAmt);

        double withdrawAmt = sc.nextDouble();
        account.withdraw(withdrawAmt);

        account.displayAccount();

        sc.close();
    }
}