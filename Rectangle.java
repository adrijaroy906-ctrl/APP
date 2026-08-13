class Rectangle {
//Week2_Question4
    int length;
    int breadth;

    int calculateArea() {
        return length * breadth;
    }

    public static void main(String args[]) {

        Rectangle r = new Rectangle();

        r.length = 20;
        r.breadth = 8;

        System.out.println("Length  : " + r.length);
        System.out.println("Breadth : " + r.breadth);
        System.out.println("Area of Rectangle = " + r.calculateArea());
    }
}