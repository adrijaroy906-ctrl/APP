import java.util.Scanner;
//Week6_Ques6

package payments;

public class UPIPayment implements SecurePayment, OnlineTransaction {

    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using UPI");
    }

    public void verifyPayment() {
        System.out.println("UPI payment verified");
    }
}

