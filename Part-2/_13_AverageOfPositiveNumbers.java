import java.util.Scanner;

public class AverageOfPositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        int sum=0;
        int posnum=0;

        while(true){
            int input=scanner.nextInt();
            
            while(input!=0){
                if(input>0){
                    posnum++;
                    sum+=input;
                }
                input=scanner.nextInt();
            }

            if(input==0){
                break;
            }
        }
        if(posnum==0 || sum==0){
            System.out.println("Cannot calculate the average");
        }else{
            double avg=(double)sum/posnum;
            System.out.println(avg);
        }
        
    }
}
