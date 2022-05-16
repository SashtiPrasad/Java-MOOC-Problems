import java.util.Scanner;

public class _27_AVClub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input=scanner.nextLine();
        while(!input.isEmpty()){
            String[] split=input.split(" ");
            for(String s:split){
                if(s.contains("av")){
                    System.out.println(s);
                }
            }
            input=scanner.nextLine();
        }
    }
}
