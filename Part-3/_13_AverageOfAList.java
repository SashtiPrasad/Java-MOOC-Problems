import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _13_AverageOfAList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers=new ArrayList<>();
        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        int count=0;
        int sum=0;
        while(true){
            int input=scanner.nextInt();
            if(input==-1){
                break;
            }
            numbers.add(input);
            count++;
        }
        // Then it computes the average of the numbers on the list
        // and prints it.
        for(int x=0;x<numbers.size();x++){
            sum+=numbers.get(x);
        }
        double avg=(double)sum/count;
        System.out.println("Average: "+avg);
    }
}
