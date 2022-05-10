import java.util.Scanner;

public class _12_AverageOfNumbers {
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
        double avg=(double)sum/total_numbers;
        System.out.println("Average of the numbers: "+avg);
    }
}
