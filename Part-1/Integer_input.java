import java.util.Scanner;

public class Integer_input {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Give a number:");

        //Using Integer.valueOf to convert string to integer
        int input=Integer.valueOf(scanner.nextLine());
        System.out.println("You gave the number "+input);
    }
}
