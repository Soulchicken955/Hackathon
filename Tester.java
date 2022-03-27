import java.util.Scanner;
import java.util.ArrayList;

public class Tester {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            // For simplicity, we hard-coded a sample of a student user.
            String name = ("Myles");
            int gradeTarget = (80);
            ArrayList<Integer> grades = new ArrayList<Integer>();
            grades.add(72);
            int time = (3);
            Student user = new Student(name, grades, gradeTarget, time);
            int hours = 5;

            if (user.calcChoice(hours) == false)
                System.out.print("Hey " + name + "! You’ve spent " + hours
                        + " hours on Instagram today! You might want to start working on your class ENGIN-77 grade ("
                        + grades.get(0) + "%)!");

        }
    }

}
