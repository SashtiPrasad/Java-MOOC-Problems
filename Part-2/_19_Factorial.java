import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Give a number: ");
        int input=scanner.nextInt();
        int factorial=1;

        for(int x=1;x<=input;x++){
            factorial*=x;
        }

        System.out.print("Factorial: "+factorial);
    }
}
