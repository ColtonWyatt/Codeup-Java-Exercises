import java.util.Arrays;
import java.util.Random;

public class ServerNameGenerator {






    public static void main(String[] args) {

        String [] adj = {"Standing", "Walking", "Riding", "Running", "Hovering", "Sliding", "Punching", "Singing", "Punching", "Squating"};
//        System.out.println(Arrays.toString(adj));

        int randomIndex = (int)(Math.random()*adj.length);
//        System.out.println("randomIndex = " + randomIndex);

        String randomElement = adj[randomIndex];
//        System.out.println("Random Element = " + randomElement);

        String [] noun = {"Dog", "Cat", "Horse", "Bird", "Mouse", "Alligator", "Honey Badger", "Snake", "Donkey", "llama"};
//        System.out.println(Arrays.toString(noun));

        int index = (int)(Math.random()*noun.length);
//        System.out.println("Index = " + index);

        String element = noun[index];
//        System.out.println("Element = " + element);

        System.out.println("Your server name is: " + randomElement + "-" + element);

    }
}
