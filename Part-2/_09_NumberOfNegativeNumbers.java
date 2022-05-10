import java.util.Scanner;

public class _09_NumberOfNegativeNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int negnum=0;

        while(true){
            System.out.println("Give a number:");
            int input=scanner.nextInt();

            while(input!=0){
                if(input<0){
                    negnum++;
                }
                System.out.println("Give a number:");
                input=scanner.nextInt();
            }
            if(input==0){
                break;
            }
        }
        System.out.println("Number of negative numbers: "+negnum);
    }
}
