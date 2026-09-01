import java.util.Scanner;
//Week6_Ques6
package accounts;

public class SavingsAccount extends Account {

    public SavingsAccount(String no, String name, double balance) {
        super(no, name, balance);
    }

    //Override
    public void displayDetails() {
        System.out.println("Savings Account");
        System.out.println("Account No: " + accountNo);
        System.out.println("Name: " + name);
        System.out.println("Balance: Rs." + balance);
    }
}

