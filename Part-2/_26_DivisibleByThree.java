import java.util.Scanner;

public class _26_DivisibleByThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    }

    public static void divisibleByThreeInRange(int beginning, int end){
        for(int x=beginning;x<=end;x++){
            if(x%3==0){
                System.out.println(x);
            }
        }
    }


}
}
