import java.util.Scanner;

public class _09_Conversation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Greetings! How are you doing?");
        String response=scanner.nextLine();
        System.out.println("Oh, how interesting. Tell me more!");
        String answer=scanner.nextLine();
        System.out.println("Thanks for sharing!");
    }
}
