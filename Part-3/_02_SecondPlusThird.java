
import java.util.ArrayList;
import java.util.Scanner;

public class _02_SecondPlusThird {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            }
            
            numbers.add(number);
        }
        //Adding the numbers at second and third position.
        System.out.println(numbers.get(1)+numbers.get(2));
    }
}
