import java.util.ArrayList;
import java.util.Scanner;

public class _32_PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();
        int length=0;
        String longname="empty";
        int years=0;
        int count=0;

        while(!input.isEmpty()){
            String[] split=input.split(",");
            String tempname=split[0];

            //For average of birth years
            years+=Integer.valueOf(split[1]);
            count++;

            //For checking which is the longest name
            if(length<tempname.length()){
                longname=tempname;
                length=tempname.length();
            }
            input=scanner.nextLine();
        }
        double avg=(double)years/count;
        System.out.println("Longest name: "+longname);
        System.out.println("Average of the birth years: "+avg);

    }
}
