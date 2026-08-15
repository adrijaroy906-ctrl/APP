import java.util.Scanner;
//Week4_Ques5
class Ride {
    
    int rideNumber;
    String rideName;

    
    public Ride(int rideNumber, String rideName) {
        this.rideNumber = rideNumber;
        this.rideName = rideName;
    }

    
    public void displayActivityPattern() {
        System.out.print(rideName + " : ");
        
       
        for (int j = 1; j <= rideNumber; j++) {
            System.out.print("*");
        }
        
        System.out.println(); 
    }
}

public class AmusementParkSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Ride[] rides = new Ride[5];

        System.out.println("--- Enter Details for 5 Amusement Park Rides ---");
        
        
        for (int i = 0; i < 5; i++) {
            int rideNum = i + 1; // Automatically assigns ride levels 1 to 5
            System.out.print("Enter name for Ride " + rideNum + ": ");
            String name = scanner.nextLine();
            

            rides[i] = new Ride(rideNum, name);
        }


        System.out.println("\n========================================");
        System.out.println("          RIDE ACTIVITY DETAILS           ");
        System.out.println("========================================");
        for (int i = 0; i < 5; i++) {
            rides[i].displayActivityPattern();
        }

        scanner.close();
    }
}
