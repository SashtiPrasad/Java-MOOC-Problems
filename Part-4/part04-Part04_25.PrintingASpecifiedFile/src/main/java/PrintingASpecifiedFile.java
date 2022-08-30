import java.nio.file.Paths;
import java.util.Scanner;
 
public class PrintingASpecifiedFile {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input=scanner.nextLine();
 
        try(Scanner scanner2=new Scanner(Paths.get(input))){
            while(scanner2.hasNextLine()){
                String lines=scanner2.nextLine();
                System.out.println(lines);
            }
        } catch (Exception exception){
            System.out.println("Error: "+exception.getMessage());
        }
    }
}