import java.util.Scanner;
//week_ques5
class Area {

    void area(int side) {
        System.out.println("Area of Square = " + (side * side));
    }

    void area(int length, int breadth) {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }

    void area(double radius) {
        System.out.println("Area of Circle = " + (3.14 * radius * radius));
    }
}

public class Geometry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Area obj = new Area();

        System.out.print("Enter side of square: ");
        int side = sc.nextInt();

        System.out.print("Enter length of rectangle: ");
        int length = sc.nextInt();

        System.out.print("Enter breadth of rectangle: ");
        int breadth = sc.nextInt();

        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();

        obj.area(side);
        obj.area(length, breadth);
        obj.area(radius);

        sc.close();
    }
}