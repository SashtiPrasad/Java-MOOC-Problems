
import java.util.Scanner;

public class _29_Adulthood {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How old are you?"); 
        int input=Integer.valueOf(scan.nextLine());
        
        if(input>=18){
            System.out.println("You are an adult");
        } else{
            System.out.println("You are not an adult");
        }
    }
}
