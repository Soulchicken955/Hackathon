import java.util.Scanner;
import java.util.ArrayList;

public class Student {
    private String email = new String();
    private String name = new String();
    private int maxHours;
    private int targetGrade;
    private ArrayList<Integer> grades = new ArrayList<Integer>();

    public Student(String givenName, ArrayList<Integer> givenGrades, int givenTarget,
            int givenMaxTime) {
        setName(givenName);
        setGrades(givenGrades);
        setTargetGrade(givenTarget);
        setMaxHours(givenMaxTime);
    }

    public boolean calcChoice(int currentHours) {
        // Primary grade calculator
        // Determines if the current grades are higher than the goal set

        // First determine if the hours spent so far are higher than the max hours
        if (currentHours >= maxHours) {
            // Determine
            for (int i = 0; i < grades.size(); i++) {
                if (grades.get(i) < targetGrade) {
                    return false;
                }
            }
        }
        return true;

    }

    public void setEmail(String given) {
        email = given;
    }

    public void setName(String given) {
        name = given;
    }

    public void setMaxHours(int given) {
        maxHours = given;
    }

    public void setGrades(ArrayList<Integer> given) {
        grades = given;
    }

    public void setTargetGrade(int given) {
        targetGrade = given;
    }

    // // Generates a message depending on how far behind the user is.
    // public String calcSeverity(int hours, int maxHours, int goal, ArrayList
    // grades) {
    // int diffHours = hours - maxHours;
    // ArrayList badGrades = new ArrayList();
    // for (int i = 0; i < grades.size(); i++) {
    // if (grades.get(i) < goal) {
    // badGrades.add(goal - grades.get(i));
    // }
    // }

    // String message = "";
    // if (diffHours > ~Some Minor Breaking Point) {
    // message += "Hey, you've been on your phone for ";
    // } else if (diffHours > ~Some Decent Breaking Point) {
    // message += "Come on, " +pronoun of some sort+ ", you've been on your phone
    // for "
    // } else if (diffHours > ~Some Major Breaking Point) {
    // message += "WARNING: You have been on your phone for ";
    // } else {
    // return "wtf how";
    // }

    // message += hours + ". You currently have " +badGrades.size()+ " grades below
    // your goal!";
    // return message;
    // }

    // Run main every time an app is opened with the widget enabled
    // public void main(Person data) {
    // if (!calcChoice(~all the variables from "data")) {
    // //In reality, create a message on the app with the String.
    // System.out.println(calcSeverity(~all the variables from "data"));
    // if (data.getUserSetting().equals("HARDCORE")) {
    // //Block usage of apps until manually ignored.
    // }
    // }
    // }

    // Other Notes:
    // Assume Person is an object created after the initial survey that stores
    // the
    // used variables
    // Add whatever you feel is necessary as well```
}
