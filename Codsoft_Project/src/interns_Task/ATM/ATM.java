package interns_Task.ATM;

public class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive number.");
        } else if (account.getBalance() >= amount) {
            account.withdraw(amount);
            System.out.println("Withdrawal successful. Please collect your cash.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive number.");
        } else {
            account.deposit(amount);
            System.out.println("Deposit successful.");
        }
    }

    public void checkBalance() {
        System.out.println("Your current balance is: " + account.getBalance());
    }
}
