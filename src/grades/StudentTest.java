package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentTest {
    public static void main(String[] args) {

    Student Colt = new Student("Colt");
    Colt.addGrade(50);
    Colt.addGrade(60);
    Colt.addGrade(70);
    Colt.addGrade(65);

        System.out.println(Colt.getGradeAverage());

    }
}
