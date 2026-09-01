import java.util.Scanner;
//Week6_Ques6
package accounts;

public class CurrentAccount extends Account {

    public CurrentAccount(String no, String name, double balance) {
        super(no, name, balance);
    }

    \\Override
    public void displayDetails() {
        System.out.println("Current Account");
        System.out.println("Account No: " + accountNo);
        System.out.println("Name: " + name);
        System.out.println("Balance: Rs." + balance);
    }
}

