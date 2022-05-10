import java.util.Scanner;

public class _20_RepeatingBreakingAndRemembering {
    public static void main(String[] args) {

        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);

        // //Part 1: Reading
        // System.out.println("Give numbers:");
        // int input1=scanner.nextInt();
        // while(input1!=-1){
        //     input1=scanner.nextInt();
        // }
        // if(input1==-1){
        //     System.out.println("Thx! Bye!");
        // }

        //Part 2: Sum of numbers
        // System.out.println("Give numbers:");
        // int input1=scanner.nextInt();
        // int sum=0;
        // while(input1!=-1){
        //     sum+=input1;
        //     input1=scanner.nextInt();
        // }
        // if(input1==-1){
        //     System.out.println("Thx! Bye!");
        //     System.out.println("Sum: "+sum);
        // }

        //Part 3: Sum and the number of numbers
        // System.out.println("Give numbers:");
        // int input1=scanner.nextInt();
        // int sum=0;
        // int count=0;
        // while(input1!=-1){
        //     sum+=input1;
        //     count++;
        //     input1=scanner.nextInt();
        // }
        // if(input1==-1){
        //     System.out.println("Thx! Bye!");
        //     System.out.println("Sum: "+sum);
        //     System.out.println("Numbers: "+count);
        // }

        //Part 4: Average of numbers
        // System.out.println("Give numbers:");
        // int input1=scanner.nextInt();
        // int sum=0;
        // int count=0;
        // while(input1!=-1){
        //     sum+=input1;
        //     count++;
        //     input1=scanner.nextInt();
        // }
        // double avg=(double)sum/count;
        // if(input1==-1){
        //     System.out.println("Thx! Bye!");
        //     System.out.println("Sum: "+sum);
        //     System.out.println("Numbers: "+count);
        //     System.out.println("Average: "+avg);
        // }

        //Part 5: Even and odd numbers
        System.out.println("Give numbers:");
        int input1=scanner.nextInt();
        int sum=0;
        int count=0;
        int even=0;
        int odd=0;
        while(input1!=-1){
            if(input1%2==0){
                even++;
            }else{
                odd++;
            }
            sum+=input1;
            count++;
            input1=scanner.nextInt();
        }
        double avg=(double)sum/count;
        if(input1==-1){
            System.out.println("Thx! Bye!");
            System.out.println("Sum: "+sum);
            System.out.println("Numbers: "+count);
            System.out.println("Average: "+avg);
            System.out.println("Even: "+even);
            System.out.println("Odd: "+odd);
        }
    }
}
