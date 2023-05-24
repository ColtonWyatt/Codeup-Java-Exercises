package util;
import java.util.Scanner;
public class Input {
    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString(){
        return this.scanner.nextLine();
    }

    public boolean yesNo(){
        String userInput = scanner.nextLine();
        if (userInput.equalsIgnoreCase("yes")|| userInput.equalsIgnoreCase("y")){
            return true;
        } else {
            return false;
        }
    }

    public int getInt(){
        return this.scanner.nextInt();
    }

    public double getDouble(){
        return this.scanner.nextDouble();
    }

    public int getInt(int min, int max){
        int userNum = Integer.valueOf(this.getString());
        if(userNum >= min && userNum <= max){
            return userNum;
        }
        System.out.println("Integer not between bounds enter a valid number");
        return getInt(min, max);
    }

    public double getDouble(double min, double max){
        double userNum = Double.valueOf(this.getString());
        if(userNum >= min && userNum <= max){
            return userNum;
        }
        System.out.println("Integer not between bounds enter a valid number");
        return getDouble(min, max);
    }


    public static void main(String[] args) {
        Input inputOne = new Input();
//        System.out.println("Get String: ");
//        System.out.println(inputOne.getString());
//        System.out.println("yesNo: ");
//        System.out.println(inputOne.yesNo());
//        System.out.println("Give me a number between 1 and 10");
//        System.out.println(inputOne.getInt(1, 10));
//        System.out.println("Give me a number between 1.0 and 10.0: ");
//        System.out.println(inputOne.getDouble(1.0, 10.0));
    }
}
