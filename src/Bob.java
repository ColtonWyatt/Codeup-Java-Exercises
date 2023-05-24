import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String confirm;


        do {
            System.out.println("Talk to Bob (Be sure to use punctuation)");
            String userInput = sc.nextLine();

            if (userInput.endsWith("?")) {
                System.out.println("Sure.");
            } else if (userInput.endsWith("!")) {
                System.out.println("Whoa, Chill out!");
            } else if (userInput.isEmpty()) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }

            System.out.println("Would you like to keep talking to Bob? [y/n]");
            confirm = sc.next();
            sc.nextLine();

        }while (confirm.equals("y"));
            System.out.println("Yeah, me neither...");
    }

}
