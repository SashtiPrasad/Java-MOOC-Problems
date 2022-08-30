
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("First name: ");
            String fname=scanner.nextLine();

            if(fname.isEmpty()){
                break;
            }

            System.out.print("Last name: ");
            String lname= scanner.nextLine();

            System.out.print("Identification number: ");
            String identificationNum=scanner.nextLine();

            infoCollection.add(new PersonalInformation(fname, lname, identificationNum));
        }
        System.out.println();

        for(PersonalInformation peopleInfo : infoCollection){
            System.out.println(peopleInfo.getFirstName()+" "+peopleInfo.getLastName());
        }

    }
}
