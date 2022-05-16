import java.util.Scanner;
import java.util.ArrayList;

public class _08_OnlyTheseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }
        System.out.print("From where? ");
        int fromnum=scanner.nextInt();
        System.out.print("To where? ");
        int tonum=scanner.nextInt();

        for(int x=fromnum;fromnum<=tonum;fromnum++){
            System.out.println(numbers.get(fromnum));
        }
    }
}
