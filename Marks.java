import java.util.Scanner;
//Week2_ques7
class Marks {

    int m1;
    int m2;
    int m3;

    void calculate() {
        int total = m1 + m2 + m3;
        double average = total / 3.0;

        System.out.println("\n--- Results ---");
        System.out.println("Mark 1  : " + m1);
        System.out.println("Mark 2  : " + m2);
        System.out.println("Mark 3  : " + m3);
        System.out.println("Total   : " + total);
        System.out.println("Average : " + average);
    }

    public static void main(String args[]) {
        Marks s = new Marks(); 
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Mark 1: ");
        s.m1 = scanner.nextInt();

        System.out.print("Enter Mark 2: ");
        s.m2 = scanner.nextInt();

        System.out.print("Enter Mark 3: ");
        s.m3 = scanner.nextInt();

        s.calculate();

        scanner.close();
    }
}
