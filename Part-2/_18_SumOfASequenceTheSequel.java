import java.util.Scanner;

public class _18_SumOfASequenceTheSequel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number? ");
        int input=scanner.nextInt();

        System.out.print("Last number? ");
        int input2=scanner.nextInt();
        int sum=0;

        for(int x=input;x<=input2;x++){
            sum+=x;
        }
        System.out.println("The sum is: "+sum);
    }
}
