public class StudentModel {
    String name;
    int m1, m2, m3;

    int getTotal() {
        return m1 + m2 + m3;
    }

    double getAverage() {
        return getTotal() / 3.0;
    }

    String getGrade() {
        double avg = getAverage();

        if (avg >= 90)
            return "A";
        else if (avg >= 75)
            return "B";
        else if (avg >= 60)
            return "C";
        else if (avg >= 50)
            return "D";
        else
            return "F";
    }
}
