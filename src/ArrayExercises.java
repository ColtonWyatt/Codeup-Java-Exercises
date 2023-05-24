import java.sql.Array;
import java.util.Arrays;

public class ArrayExercises {


    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        String[] Person = {"Bob", "Dave", "Bill"};


        System.out.println(Arrays.toString(Person));


        for (int i = 0; i < Person.length; i ++) {

            System.out.println(Person[i]);

        }

        String [] newPerson = Arrays.copyOf(Person, 4);
        newPerson[3] = "Jim";
        System.out.println(Arrays.toString(newPerson));

    }
}
