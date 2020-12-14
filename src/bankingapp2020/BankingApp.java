package bankingapp2020;

//GUI for a banking application
/*This basic GUI automatically loads the details of a file containing data about the
bank-accounts for a number of individuals, and provides the ability to add a new account. When
the quit option is chosen the GUI will save the updated information to
the file*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;


public class BankingApp extends JFrame implements ActionListener {

    private JMenu accountMenu;
    private JMenuItem item;
    private final File file = new File("OOPFINALEXAM_JoeySheehy/bankingapp2020/accounts.data");
    private ArrayList<BankAccount> allAccounts;

    public BankingApp( ) throws Exception {
        super("Banking System");

        Container pane = getContentPane();
        pane.setBackground(new Color(150,200,230));

        createAccountMenu(); //you must code this method

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        /*menuBar.add(accountMenu);*/ //uncomment this line of code when you have written createAccountMenu()

        setSize(400,400 );
        setVisible(true);
        allAccounts = openAccountsFile();
    }

    public static void main( String[] args ) throws Exception {
        new BankingApp();
    }

    private void createAccountMenu(){

        //you must add the code for this method

    }


    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Add")) {
            JOptionPane.showMessageDialog(null, "Adding new bank-account",
                    "Adding Bank Account", JOptionPane.INFORMATION_MESSAGE);

            //you must add some code here

        }
        else if (e.getActionCommand().equals("Amend"))
            JOptionPane.showMessageDialog(null, "Amending bank-account details",
                    "Amending Bank Account", JOptionPane.INFORMATION_MESSAGE);
        else if (e.getActionCommand().equals("Remove"))
            JOptionPane.showMessageDialog(null, "Removing bank-account",
                    "Removing Bank Account", JOptionPane.INFORMATION_MESSAGE);
        else if (e.getActionCommand().equals("View"))
            JOptionPane.showMessageDialog(null, "Viewing bank-account details",
                    "Viewing Bank Accounts", JOptionPane.INFORMATION_MESSAGE);
        else if (e.getActionCommand().equals("Quit")) {

            //you must add some code here

        }
    }

    public ArrayList<BankAccount> openAccountsFile() throws Exception {

        ObjectInputStream objectInputStream = null;

        if (!file.exists()) {
            JOptionPane.showMessageDialog(null, "Accounts file doesn't exist yet! Create it by running TestBankAccount.java first",
                    "Accounts File Does Not Exist!", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        else {
            FileInputStream fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);

            allAccounts = (ArrayList<BankAccount>) objectInputStream.readObject();

            objectInputStream.close();

            TestBankAccount.displayAccounts(allAccounts);
        }
        return allAccounts;
    }
}

