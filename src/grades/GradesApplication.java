package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {
    private static HashMap<String, Student> students;

    public static void main(String[] args) {
        students = makeStudents();
        printWelcome();
        printChoice();
    }

    public static HashMap<String, Student> makeStudents() {
        HashMap<String, Student> students = new HashMap<>();


        Student Jen = new Student("Jen");
        Jen.addGrade(100);
        Jen.addGrade(90);
        Jen.addGrade(95);
        Jen.addGrade(100);

        Student Lillian = new Student("Lillian");
        Lillian.addGrade(100);
        Lillian.addGrade(98);
        Lillian.addGrade(100);
        Lillian.addGrade(98);

        Student Jeffery = new Student("Jeffery");
        Jeffery.addGrade(80);
        Jeffery.addGrade(85);
        Jeffery.addGrade(90);
        Jeffery.addGrade(75);


        students.put("Jen", Jen);
        students.put("Lillian", Lillian);
        students.put("Jeffery", Jeffery);

        return students;

    }

    ;

    private static void printWelcome() {
        System.out.println("""
                Welcome!

                Here are the Github usernames of out Students:
                """
        );
        for (String key : students.keySet()) {
            System.out.printf("|%s| ", key);
        }
        System.out.println();


    }

    private static void printChoice() {
        String userInput ="";
        do {
            System.out.println("What student would you like to see more information on?");
            Input in = new Input();
            String userChoice = in.getString();

            if (students.containsKey(userChoice)) {
                System.out.println("Name: " + students.get(userChoice).getName() + " - GitHubUsername: " + userChoice);
                System.out.println("Current Average: " + students.get(userChoice).getGradeAverage());
                System.out.println("Would you like to continue? (y for yes and n for no)");
                userInput = in.getString();
            } else {
                System.out.println("Sorry, that doesn't match anyone in our system");
                System.out.println("Would you like to continue? (y for yes and n for no");
            };

        }while(userInput.equalsIgnoreCase("y"));
            System.out.println("Thank you, Goodbye!");
        };

};