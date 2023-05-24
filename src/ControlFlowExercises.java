import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        System.out.println(10 > 5); // True
        System.out.println(5 == 5); // True
        System.out.println(true == false);// False
        System.out.println(2 <= 2); // True

//        int i = 5;
//        while (i <= 15){
//            System.out.print("i is " + i);
//            i++;
//        }


//       int i = 0;
//       do {
//           System.out.println("i is " + i);
//            i += 2;
//       }while(i <= 100);


//        int i = 100;
//
//        do {
//            System.out.println("i is " + i);
//            i -= 5;
//        }while(i >= -10);


//        long i = 2;
//
//        do {
//            System.out.println("i is " + i);
//            i *= i;
//        }while(i < 1000000);


//        for(int i = 100; i >= 0; i -= 5 ) {
//            System.out.println("I is " + i);
//        }


//        long i;
//
//        for(i = 2; i < 1000000; i *= i){
//            System.out.println("I is: " + i);
//        }


//        for(int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0){
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }


        Scanner sc = new Scanner(System.in);
//        String choice = "y";
//
//        while(choice.equalsIgnoreCase("y")) {
//            // get the input from the user
//            System.out.println("Enter an Integer: ");
//            int integerNext = sc.nextInt();
//
//            System.out.println("Number" + "  " + "Squared" + "  " + "Cubed");
//            System.out.println("======" + "  " + "======" + "  " + "======");
//
//            for (int i = 1; i <= integerNext; i++) {
//
//                int numberSquared = (int) Math.pow(i, 2);
//                int numberCubed = (int) Math.pow(i, 3);
//
//                String message = "\n" + i + "       " + numberSquared + "       " + numberCubed;
//
//                System.out.println(message);
//                System.out.println();
//            }
//            // see if the user wants to continue
//            System.out.print("Continue? (y/n): ");
//            choice = sc.next();
//            System.out.println();
//
//        }

    boolean confirm = true;

    do{
        System.out.println("Enter a numerical grade from 0-100:");

        int userGrade = sc.nextInt();

        if (userGrade >= 88) {
            System.out.println("A");
        } else if (userGrade >= 80) {
            System.out.println("B");
        } else if(userGrade >=67){
            System.out.print("C");
        } else if (userGrade >= 59){
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        System.out.println("Continue? [y/n]");
        confirm = sc.next().equalsIgnoreCase("y");
    }while (confirm);
        System.out.println("Ok... Thanks");

    }
}

