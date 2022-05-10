import java.util.Scanner;

public class _15_DifferentTypesOfInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       System.out.println("Give a string:");
       String strinput=scan.nextLine();
       
       System.out.println("Give an integer:");
       int intinput=Integer.valueOf(scan.nextLine());
       
       System.out.println("Give a double:");
       double doubleinput=Double.valueOf(scan.nextLine());
       
       System.out.println("Give a boolean:");
       Boolean boolinput=Boolean.valueOf(scan.nextLine());
       
       System.out.println("You gave the string "+strinput);
       System.out.println("You gave the integer "+intinput);
       System.out.println("You gave the double "+doubleinput);
       System.out.println("You gave the boolean "+boolinput);
    }

    //An easy way to do this instead of the actual solution

    // public static void main(String[] args) {
    //     Scanner scan = new Scanner(System.in);

    //    System.out.println("Give a string:");
    //    String strinput=scan.nextLine();
       
    //    System.out.println("Give an integer:");
    //    You can convert the input to the desired type in this way instead of having to use "type".valueOf(scan.nextLine)
    //    int intinput=scan.nextInt();
       
    //    System.out.println("Give a double:");
    //    double doubleinput=scan.nextDouble();
       
    //    System.out.println("Give a boolean:");
    //    Boolean boolinput=scan.nextBoolean();
       
    //    System.out.println("You gave the string "+strinput);
    //    System.out.println("You gave the integer "+intinput);
    //    System.out.println("You gave the double "+doubleinput);
    //    System.out.println("You gave the boolean "+boolinput);
    // }
}
