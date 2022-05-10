import java.util.Scanner;

public class _03_AbsoluteValue {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int num=scanner.nextInt();

        if(num<0){
            num*=-1;
        }
        System.out.println(num);
    }
}
