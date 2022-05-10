import java.util.Scanner;

public class _07_OnlyPositives {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int input=scanner.nextInt();

        while(input!=0){
            if(input<0){
                System.out.println("Unsuitable number");
                System.out.println("Give a number:");
                input=scanner.nextInt();
            }else if(input>0){
                System.out.println(input*input);
            }
        }
    }
}
