import java.util.Scanner;

public class _24_SpeedingTicket {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Give speed:");
        int input=scanner.nextInt();

        if(input>120){
            System.out.println("Speeding ticket!");
        }
    }
}
