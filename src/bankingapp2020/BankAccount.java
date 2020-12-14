package bankingapp2020;

public class BankAccount extends SavingsAccount{
    String owner;
    int number;
    double balance;
    double interestRate;

    public BankAccount(String savings, double v, String albert_einstein) {this("Owner not found",0,0.00,0.00);}

    public BankAccount(String owner,int number, double balance, double interestRate) {
        setOwner(owner);
        setNumber(number);
        setBalance(balance);
        setInterestRate(interestRate);
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance<0 || balance>50000)
            this.balance = 0;
        else
            this.balance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        if(interestRate<0 || interestRate>0.015)
            this.interestRate = 0;
        else
            this.interestRate = interestRate;
    }

    public String toString() {
        return "\nOwner: " + getOwner() + "\nAccount Number: " + getNumber() + "\nBalance: " + getBalance() + "\nInterest Rate: " + getInterestRate();
    }
}
