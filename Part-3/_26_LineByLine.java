
import java.lang.reflect.Array;
import java.util.Scanner;

public class _26_LineByLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();
        while(!(input.isEmpty())){
            String[] split=input.split(" ");
            for(String s:split){
                System.out.println(s);
            }
            input=scanner.nextLine();
        }
    }
}
