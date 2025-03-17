// Base class: BankAccount
class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayAccountType() {
        System.out.println("Generic Bank Account");
    }
}

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    void displayAccountType() {
        System.out.println("Savings Account with interest rate: " + interestRate + "%");
    }
}

// Subclass: CheckingAccount
class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    void displayAccountType() {
        System.out.println("Checking Account with withdrawal limit: " + withdrawalLimit);
    }
}

// Subclass: FixedDepositAccount
class FixedDepositAccount extends BankAccount {
    int maturityPeriod;

    FixedDepositAccount(int accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }

    @Override
    void displayAccountType() {
        System.out.println("Fixed Deposit Account with maturity period: " + maturityPeriod + " months");
    }
}

// Testing the classes
public class BankTest {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount(1001, 5000.0, 3.5);
        BankAccount checking = new CheckingAccount(1002, 3000.0, 1000.0);
        BankAccount fixedDeposit = new FixedDepositAccount(1003, 10000.0, 12);

        BankAccount[] accounts = {savings, checking, fixedDeposit};
        for (BankAccount account : accounts) {
            System.out.println("Account Number: " + account.accountNumber);
            account.displayAccountType();
        }
    }
}
