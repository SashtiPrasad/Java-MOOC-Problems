import java.util.Scanner;

public class _16_FromWhereToWhere {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Where to? ");
        int input=scanner.nextInt();
        //Part 1
        for(int x=1;x<=input;x++){
            System.out.println(x);
        }

        //Part 2
        System.out.print("Where to? ");
        input=scanner.nextInt();

        System.out.print("Where from? ");
        int toinput=scanner.nextInt();

        for(int x=toinput;x<=input;x++){
            System.out.println(x);
        }
    }
}
