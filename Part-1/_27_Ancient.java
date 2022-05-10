
import java.util.Scanner;

public class _27_Ancient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a year:");
        int input=Integer.valueOf(scan.nextLine());
        if(input<2015){
            System.out.println("Ancient history!");
        }
    }
}
