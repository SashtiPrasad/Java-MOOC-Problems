import java.util.Scanner;

public class _10_SumOfNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sum=0;

        while(true){
            System.out.println("Give a number: ");
            int input=scanner.nextInt();

            //This is to add the first input to the total sum
            //It can also be done as sum+=input.
            //Both would have the same output since value of sum is 0
            sum=input;

            while(input!=0){
                System.out.println("Give a number: ");
                input=scanner.nextInt();
                sum+=input;
            }
            if(input==0){
                break;
            }
        }
        System.out.println("Sum of the numbers: "+sum);
    }
}
