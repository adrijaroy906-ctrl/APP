import java.util.Scanner;
//Week6_Ques4

interface Confidential {
    // Tagging interface
}

class Document {
    String name;

    Document(String name) {
        this.name = name;
    }
}

class Report extends Document implements Confidential {
    Report(String name) {
        super(name);
    }
}

class Letter extends Document {
    Letter(String name) {
        super(name);
    }
}

public class DocumentManagement {
    public static void main(String[] args) {

        Document d1 = new Report("Company Report");
        Document d2 = new Letter("Normal Letter");

        if (d1 instanceof Confidential)
            System.out.println(d1.name + " is Confidential");
        else
            System.out.println(d1.name + " is not Confidential");

        if (d2 instanceof Confidential)
            System.out.println(d2.name + " is Confidential");
        else
            System.out.println(d2.name + " is not Confidential");
    }
}

