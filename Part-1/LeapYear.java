import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.print("Give a year:");
        int year=scanner.nextInt();

        //Cutting down majority of the cases with the if condition.
        if(year%4!=0){
            System.out.println("The year is not a leap year");
        }//If it is divisible by 4, next check would be to see if it is divisible by 100.
        //If it is divisible by 100, the next check is to see if it is divisible by 400.
        //with this else if condition, we can easily find if it is a leap year.
        else if(year%100==0 && year%400!=0){
            System.out.println("The year is not a leap year");
        }else{
            System.out.println("The year is a leap year");
        }
    }
}
