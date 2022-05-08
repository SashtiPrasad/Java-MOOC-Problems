import java.util.Scanner;

public class GiftTax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value fo the gift?");
        Integer number=scan.nextInt();
        Double tax_value=0.0;

        if(number<5000){
            System.out.println("No tax!");
        }else if(number<25000){
            tax_value=(100+(number-5000)*0.08);
            System.out.println("Tax: "+tax_value);
        }else if(number<55000){
            tax_value=(1700+(number-25000)*0.1);
            System.out.println("Tax: "+tax_value);
        }else if(number<200000){
            tax_value=(4700+(number-55000)*0.12);
            System.out.println("Tax: "+tax_value);
        }else if(number<1000000){
            tax_value=(22100+(number-200000)*0.15);
            System.out.println("Tax: "+tax_value);
        }else{
            tax_value=(142100+(number-1000000)*0.17);
            System.out.println("Tax: "+tax_value);
        }
    }
}
