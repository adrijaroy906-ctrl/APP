import java.util.Scanner;
//Week6_Ques6
package accounts;

public class Account {
    protected String accountNo;
    protected String name;
    protected double balance;

    public Account(String accountNo, String name, double balance) {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
    }

    public void displayDetails() {
        System.out.println("Account No: " + accountNo);
        System.out.println("Name: " + name);
        System.out.println("Balance: Rs." + balance);
    }
}

