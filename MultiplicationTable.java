import java.util.Scanner;
// Week1_ques5
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
 
        System.out.print("Enter a number to generate its multiplication table: ");
        int num = scanner.nextInt();
        
        System.out.println("Multiplication Table for " + num + ":");
        
        for (int i = 1; i <= 10; i++) {
            int product = num * i;
            System.out.println(num + " x " + i + " = " + product);
        }
        
        scanner.close();
    }
}
