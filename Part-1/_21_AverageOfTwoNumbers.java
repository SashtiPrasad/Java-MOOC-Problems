import java.util.Scanner;

public class _21_AverageOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Give the first number:");
        int input1=scanner.nextInt();

        System.out.println("Give the second number:");
        int input2=scanner.nextInt();

        double avg=((double)input1+input2)/2;
        System.out.println("The average is "+avg);
    }
}
