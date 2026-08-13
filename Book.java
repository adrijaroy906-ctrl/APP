import java.util.Scanner;
//week2_Ques2
class Book {

    String title;
    String author;
    double price;

    public static void main(String args[]) {

        Book b = new Book();

        b.title = "Harry Potter and the Goblet of Fire";
        b.author = "JK Rowling";
        b.price = 750.00;

        System.out.println("Book Details");
        System.out.println("Title  : " + b.title);
        System.out.println("Author : " + b.author);
        System.out.println("Price  : Rs. " + b.price);
    }
}