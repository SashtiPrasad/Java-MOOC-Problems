import java.util.Scanner;

public class _23_PrintThrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here
        System.out.print("Give a word: ");
        String input=scanner.nextLine();
        for(int x=0;x<3;x++){
            System.out.print(input);
        }
    }
}
