import java.util.Scanner;

public class _32_OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input=Integer.valueOf(scan.nextLine());
        if(input%2==0){
            System.out.println("Number "+input+" is even");
        } else{
            System.out.println("Number "+input+" is odd");
        }
    }
}
