import java.util.ArrayList;
import java.util.Scanner;


public class _10_IndexOf {
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

        // implement here finding the indices of a number

        System.out.print("Search for? ");
        int input=scanner.nextInt();
        int index=0;

        while(index<list.size()){
            if(list.get(index)==input){
                System.out.println(input + " is at index "+index);
            }
            index++;
        }
    }
}
