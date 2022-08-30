
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();
        Statistics evenSum = new Statistics();
        Statistics oddSum=new Statistics();
        System.out.println("Enter numbers: ");
        int value=scanner.nextInt();
        while(value!=-1){
            statistics.addNumber(value);
            if(value%2==0){
                evenSum.addNumber(value);
            }else{
                oddSum.addNumber(value);
            }
            value=scanner.nextInt();
        }
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Sum of even numbers: " + evenSum.sum());
        System.out.println("Sum of odd numbers: " + oddSum.sum());
        System.out.println("Average: "+statistics.average());
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
    }
}
