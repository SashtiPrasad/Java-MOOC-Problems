import java.util.Scanner;

public class _17_SumOfASequence {
    public static void main(String[] args) {
        System.out.print("Last number? ");
        Scanner scanner=new Scanner(System.in);
        int input=scanner.nextInt();
        int sum=input;

        for(int x=1;x<input;x++){
            sum+=x;
        }
        System.out.println("The sum is "+sum);
    }
}
