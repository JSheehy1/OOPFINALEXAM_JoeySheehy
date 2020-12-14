package bankingapp2020;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class TestBankAccount{
    public static void main(String[] args) {
          BankAccount b1 = new BankAccount("Albert Einstein",14256738,203872.37,0.015);
          BankAccount b2 = new BankAccount("Marie Curie",73627822,187938.66,0.015);
          BankAccount b3 = new BankAccount("Isaac Newton",52345532,3757432.44,0.015);
          BankAccount b4 = new BankAccount("James Gosling",74423423,872637.33,0.015);

    }

    public static void displayAccounts(ArrayList<BankAccount> allAccounts) {
    }
}
