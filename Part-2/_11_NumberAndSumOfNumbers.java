import java.util.Scanner;

public class _11_NumberAndSumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int total_numbers=0;
        int sum=0;

        while(true){
            System.out.println("Give a number:");
            int input=scanner.nextInt();
            sum=input;

            while(input!=0){
                total_numbers++;
                System.out.println("Give a number:");
                input=scanner.nextInt();
                sum+=input;
            }

            if(input==0){
                break;
            }
        }
        System.out.println("Number of numbers: "+total_numbers);
        System.out.println("Sum of numbers: "+sum);
    }
}
