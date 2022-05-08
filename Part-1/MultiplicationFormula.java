import java.util.Scanner;

public class MultiplicationFormula {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Give the first number:");
        int input1=scanner.nextInt();

        System.out.println("Give the second number:");
        int input2=scanner.nextInt();

        int product=input1*input2;
        System.out.println(input1+" * "+input2+" = "+product);
    }
}
