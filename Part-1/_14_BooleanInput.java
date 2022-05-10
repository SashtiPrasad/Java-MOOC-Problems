import java.util.Scanner;

public class _14_BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write something:");
        boolean value=Boolean.valueOf(scanner.nextLine());
        System.out.print("True or false? "+value);
    }
}