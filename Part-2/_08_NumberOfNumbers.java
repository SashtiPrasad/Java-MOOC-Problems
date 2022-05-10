import java.util.Scanner;

public class _08_NumberOfNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numbers=0;

        while(true){
            System.out.println("Give a number:");
            int input=scanner.nextInt();

            while(input!=0){
                numbers++;
                System.out.println("Give a number:");
                input=scanner.nextInt();
            }
            if(input==0){
                break;
            }
        }
        System.out.println("Number of numbers: "+numbers);
    }
}
