
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Items> items=new ArrayList<>();
        Items item;

        while(true){
            System.out.println("Identifier? (empty will stop)");
            String newIdentifier=scanner.nextLine();
            if(newIdentifier.isEmpty()){
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            String newName=scanner.nextLine();
            if(newName.isEmpty()){
                break;
            }

            item=new Items(newIdentifier, newName);
            if(!items.contains(item)){
                items.add(item);
            }
        }

        for(Items n:items){
            System.out.println(n.getIdentifier()+": "+n.getName());
        }
    }
}

