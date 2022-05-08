
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give the first number:");
        Integer num1=scan.nextInt();

        System.out.println("Givve the second number:");
        Integer num2=scan.nextInt();
        
        if(num1>num2){
            System.out.println("Greater number is: "+num1);
        }else if(num2>num1){
            System.out.println("Greater number is: "+num2);
        }else{
            System.out.println("The numbers are equal!");
        }
    }
}
