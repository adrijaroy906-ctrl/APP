import java.util.Scanner;
//Week6_Ques6
import accounts.*;
import payments.*;

public class Main {
    public static void main(String[] args) {

        // Runtime Polymorphism
        Account a;

        a = new SavingsAccount("S101", "Adrija", 25000);
        a.displayDetails();

        System.out.println();

        a = new CurrentAccount("C101", "Rahul", 40000);
        a.displayDetails();

        System.out.println();

        // Payment
        Payment p;

        p = new UPIPayment();
        p.pay(2000);
        ((UPIPayment)p).verifyPayment();

        System.out.println();

        p = new CardPayment();
        p.pay(3000);

        // Tagging interface
        if (p instanceof OnlineTransaction)
            System.out.println("Card payment is an online transaction");
    }
}

