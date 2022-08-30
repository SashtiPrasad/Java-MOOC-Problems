import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner=new Scanner(System.in);
        ArrayList<Book> bookinfo = new ArrayList<>();

        while(true){
            System.out.print("Title: ");
            String bookTitle= scanner.nextLine();

            if(bookTitle.isEmpty()){
                break;
            }

            System.out.print("Pages: ");
            int pages=Integer.valueOf(scanner.nextLine());

            System.out.print("Publication year: ");
            int pubyear=Integer.valueOf(scanner.nextLine());

            bookinfo.add(new Book(bookTitle, pages, pubyear));
        }

        System.out.print("What information will be printed? ");
        String response=scanner.nextLine();
        if(response.equals("everything")){
            for(Book books:bookinfo){
                System.out.println(books);
            }
        }else if(response.equals("name")){
            for(Book books:bookinfo){
                System.out.println(books.getBookName());
            }
        }
    }
}
