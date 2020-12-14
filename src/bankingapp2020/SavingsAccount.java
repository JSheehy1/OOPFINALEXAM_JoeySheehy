package bankingapp2020;

public class SavingsAccount{
    String type;
    double taxRate;
    double balance;

    public SavingsAccount() {this("Type not found",0,0);}

    public SavingsAccount(String type, double taxRate, double balance){
        setType(type);
        setTaxRate(taxRate);
        setBalance(balance);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        if(taxRate<0 || taxRate>1)
            this.taxRate = 0;
        else
            this.taxRate = taxRate;
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

    public String toString() {
        return "\nAccount Type: " + getType() + "\nTax Rate: " + getTaxRate();
    }

    public void calculateTaxDue() {
        Math.multiplyExact(balance,taxRate);
    }


}
