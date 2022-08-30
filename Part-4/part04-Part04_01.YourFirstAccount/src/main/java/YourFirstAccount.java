
public class YourFirstAccount {

    public static void main(String[] args) {
        Account slim=new Account("Slim", 100.0);
        slim.deposit(20.0);
        System.out.println(slim.toString());
    }
}
