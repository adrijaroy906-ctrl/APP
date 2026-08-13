class Temperature {
//week2_ques8
    double celsius;

    void convert() {

        double fahrenheit = (9 * celsius / 5) + 32;

        System.out.println("Temperature Conversion");
        System.out.println("Celsius    : " + celsius + " °C");
        System.out.println("Fahrenheit : " + fahrenheit + " °F");
    }

    public static void main(String args[]) {

        Temperature t = new Temperature();

        t.celsius = 40;

        t.convert();
    }
}