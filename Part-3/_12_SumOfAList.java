import java.util.ArrayList;
import java.util.Scanner;

public class _12_SumOfAList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");
        int sum=0;
        for(int x=0;x<list.size();x++){
            sum+=list.get(x);
        }
        System.out.println("Sum: " +sum);
    }
}
