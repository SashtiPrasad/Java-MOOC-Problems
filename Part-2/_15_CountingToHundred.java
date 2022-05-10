import java.util.Scanner;

public class _15_CountingToHundred {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int input=scanner.nextInt();

        for(int x=input;x<=100;x++){
            System.out.println(x);
        }
    }
}
