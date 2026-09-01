
import java.util.Scanner;
//Week6_Ques6
package payments;

public class CardPayment implements Payment, OnlineTransaction {

    public void pay(double amount) {
        System.out.println("Paid Rs." + amount + " using Card");
    }
}
