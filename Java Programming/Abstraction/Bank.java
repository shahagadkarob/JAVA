package p1;

abstract class BankAccount {
    int accountNumber;
    String holderName;
    double balance;

    abstract void withdraw(double amount) ;
    abstract void deposit(double amount) ;

    BankAccount() {
        this.accountNumber = 0;
        this.holderName = "Not Given";
        this.balance = 0.0;
    }

    BankAccount(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    void setHolderName(String holderName) {
        this.holderName = holderName;
    }
    void setBalance(double balance) {
        this.balance = balance;
    }
    int getAccountNumber() {
        return this.accountNumber;
    }
    String getHolderName() {
        return this.holderName;
    }
    double getBalance() {
        return this.balance;
    }


    void Display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double dailyWithdrawalLimit;

    void withdraw(double amount) {
        if (amount > dailyWithdrawalLimit) {
            System.out.println("Withdrawal amount exceeds daily limit.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " successful. New balance: " + balance);
        }
    }
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of " + amount + " successful. New balance: " + balance);
    }

    SavingsAccount(){
        super();
        this.dailyWithdrawalLimit = 0.0;
    }
    SavingsAccount(int accountNumber, String holderName, double balance,double dailyWithdrawalLimit) {
        super(accountNumber, holderName, balance);
        this.dailyWithdrawalLimit = dailyWithdrawalLimit;
    }
    void setDailyWithdrawalLimit(double dailyWithdrawalLimit) {
        this.dailyWithdrawalLimit = dailyWithdrawalLimit;
    }
    double getDailyWithdrawalLimit() {
        return this.dailyWithdrawalLimit;
    }

    void Display() {
        super.Display();
        System.out.println("Daily Withdrawal Limit: " + dailyWithdrawalLimit);
    }
}
class CurrentAccount extends BankAccount {
    double overdraftLimit;

    CurrentAccount() {
        super();
        this.overdraftLimit = 0.0;
    }

    CurrentAccount(int accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    double getOverdraftLimit() {
        return this.overdraftLimit;
    }

    @Override
    void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawal successful from Current Account");
        } else {
            System.out.println("Withdrawal failed: Overdraft limit exceeded");
        }
    }

    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful in Current Account");
    }

    void Display() {
        super.Display();
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}

class TestBank {
    public static void main(String[] args) {
        BankAccount b1 = new CurrentAccount(102, "Shahagadkar", 75000, 30000);
        BankAccount s1 = new SavingsAccount(101, "Onkar", 50000, 20000);
        b1.Display();
        s1.Display();
    }
}

