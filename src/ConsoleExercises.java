
import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args){

        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f %n", pi);

        Scanner sc = new Scanner(System.in);
//      System.out.println("Enter a integer: ");
//      int userInput = sc.nextInt();
//      System.out.printf("Your integer is %d %n", userInput);

//      When something that is not an integer...
//      Exception in thread "main" java.util.InputMismatchException
//	    at java.base/java.util.Scanner.throwFor(Scanner.java:947)
//	    at java.base/java.util.Scanner.next(Scanner.java:1602)
//	    at java.base/java.util.Scanner.nextInt(Scanner.java:2267)
//	    at java.base/java.util.Scanner.nextInt(Scanner.java:2221)
//	    at ConsoleExercises.main(ConsoleExercises.java:10)


//      System.out.println("Enter three words: ");
//      String inputOne = sc.next();
//      System.out.println("The first word you entered was: " + inputOne);
//      String inputTwo = sc.next();
//      System.out.println("The second word you entered was: " + inputTwo);
//      String inputThree = sc.next();
//      System.out.println("The third word you entered was: " + inputThree);

//      System.out.println("Enter a sentence: ");
//      String userSentence = sc.nextLine();
//      System.out.println("The sentence you entered was: " + userSentence);

        System.out.println("Enter the length, width, and height of your room: ");
        int length = sc.nextInt();
        System.out.printf("the length of your room is: %d %n", length);
        int width = sc.nextInt();
        System.out.printf("the width of your room is: %d %n", width);
        int height = sc.nextInt();
        System.out.printf("the height of your room is: %d %n", height);
        int area = length * width;
        int perimeter = (length * 2)+(width *2);
        int volume = length * width * height;
        System.out.printf("the area of your room is: %d %n", area);
        System.out.printf(" the perimeter of your room is: %d %n", perimeter);
        System.out.printf("The Volume of your room is: %d %n", volume);

    }
}
