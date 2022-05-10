import java.util.Scanner;

public class _17_SumOfTwoNumbers{
    public static void main(String[] arg) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());

        System.out.println("The sum of the numbers is "+(first+second));
    }
}