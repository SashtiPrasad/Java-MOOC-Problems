import java.util.Scanner;

public class _16_SecondsInADay {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("How many days would you like to convert to seconds?");
        int days=scanner.nextInt();

        //1 day has 86400 seconds. 
        //So multiplying the number of days with that number will give the total number of seconds in the input
        int seconds=days*86400;
        System.out.println(seconds);
    }
}
