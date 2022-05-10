import java.util.Scanner;

public class _23_SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Give the first number:");
        int input1=scanner.nextInt();

        System.out.println("Give the second number:");
        int input2=scanner.nextInt();

        System.out.println(input1+" + "+input2+" = "+(input1+input2));
        System.out.println(input1+" - "+input2+" = "+(input1-input2));
        System.out.println(input1+" * "+input2+" = "+(input1*input2));
        System.out.println(input1+" / "+input2+" = "+((double)input1/input2));
    }
}
