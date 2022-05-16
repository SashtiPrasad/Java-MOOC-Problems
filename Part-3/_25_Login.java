
import java.util.Scanner;

public class _25_Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a username: ");
        String username=scanner.nextLine();
        System.out.print("Enter password: ");
        String pwd=scanner.nextLine();

        if((username.equals("alex") && pwd.equals("sunshine")) || username.equals("emma") && pwd.equals("haskell")){
            System.out.println("You have successfully logged in!");
        }else{
            System.out.println("Incorrect username or password!");
        }

    }
}
