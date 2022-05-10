import java.util.Scanner;

public class _05_Message {
    public static void main(String[] args) {
        //creating the scanner tool
        Scanner scanner= new Scanner(System.in);
        System.out.println("Write a message: ");

        //Calling the scanner tool with nextLine method
        String message=scanner.nextLine();

        //printing the input given by the user
        System.out.println(message);
    }
}
