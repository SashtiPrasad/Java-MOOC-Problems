import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
 
public class GuestListFromAFile {
 
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Name of the file:");
        String fileName=scanner.nextLine();
        ArrayList<String> namesList=new ArrayList<>();
 
        try(Scanner scanner2=new Scanner(Paths.get(fileName))){
            while(scanner2.hasNextLine()){
                namesList.add(scanner2.nextLine());
            }
 
            System.out.println("Enter names, an empty line quits.");
            String names=scanner.nextLine();
            while(true){
                if(names.isEmpty()){
                    break;
                }
                if(namesList.contains(names)){
                    System.out.println("The name is on the list");
                }else{
                    System.out.println("The name is not on the list.");
                }
                names=scanner.nextLine();
            }
            System.out.println("Thank you!");
        } catch(Exception exception){
            System.out.println("Error: "+exception.getMessage());
        }
    }
}