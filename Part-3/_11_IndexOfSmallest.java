import java.util.ArrayList;
import java.util.Scanner;

public class _11_IndexOfSmallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers=new ArrayList<>();

        // implement here a program that reads user input
        // until the user enters 9999
        while(true){
            int input=scanner.nextInt();
            if(input==9999){
                break;
            }
            numbers.add(input);
        }
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        int smallestnum=numbers.get(0);
        int index=0;

        for(int x=0;x<numbers.size();x++){
            if(numbers.get(x)<smallestnum){
                smallestnum=numbers.get(x);
                //Since we cannot get the x value
                //We have to assign the value of x to index
                //To get the index of the smallest number
                index=x;
            }
        }

        System.out.println("Smallest number: "+smallestnum);
        System.out.println("Found at index: "+index);

        
    }
}

