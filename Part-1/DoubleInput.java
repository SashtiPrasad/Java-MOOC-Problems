import java.util.Scanner;

public class DoubleInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");

        //another method to do it differently than the previous problem
        String input= scanner.nextLine();

        //By using another variable, we can use the string value or the double value separately
        double value=Double.valueOf(input);
        System.out.println("You gave the number "+value);

    }
}