import java.util.Scanner;

public class CheckingTheAge {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("How old are you?");
        int age=scanner.nextInt();

        if(age<0){
            System.out.println("Impossible!");
        }else if(age>120){
            System.out.println("Impossible");
        }else{
            System.out.println("OK");
        }
    }
}
