import java.util.Scanner;
import java.util.ArrayList;

public class _09_GreatestInList {
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

        // implement finding the greatest number in the list here
        int greatestnum=list.get(0);

        for(int x=0;x<list.size();x++){
            if(list.get(x)>greatestnum){
                greatestnum=list.get(x);
            }
        }

        System.out.println("The greatest number: "+greatestnum);
    }
}
