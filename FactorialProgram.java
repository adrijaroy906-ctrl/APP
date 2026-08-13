import java.util.Scanner;
// week1_ques4
public class FactorialProgram {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();
        
        long factorial = 1; 
        
        for (int i = 1; i <= num; i++) {
            factorial *= i; // Multiplies factorial by i and updates it
        }
        
        System.out.println("Factorial of " + num + " is: " + factorial);
        
        scanner.close();
    }
}
