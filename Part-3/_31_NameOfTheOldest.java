
import java.util.Scanner;

public class _31_NameOfTheOldest {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            String input=scanner.nextLine();
            int age=0;
            String name="empty";
            while(!input.isEmpty()){
                String[] split=input.split(",");
                if(age<Integer.valueOf(split[1])){
                    age=Integer.valueOf(split[1]);
                    name=split[0];
                }
                input=scanner.nextLine();  
            }
            System.out.println("Name of the oldest: "+name);
    }
}
