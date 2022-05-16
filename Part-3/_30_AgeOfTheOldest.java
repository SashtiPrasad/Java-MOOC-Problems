
import java.util.Scanner;

public class _30_AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();
        int age=0;
        while(!input.isEmpty()){
            String[] split=input.split(",");
            if(age<Integer.valueOf(split[1])){
                age=Integer.valueOf(split[1]);
            }
            input=scanner.nextLine();
        }
        System.out.println("Age of the oldest: "+age);
    }
}
