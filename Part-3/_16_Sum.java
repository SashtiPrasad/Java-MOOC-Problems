
import java.util.ArrayList;

public class _16_Sum {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        System.out.println(sum(numbers));

        numbers.add(5);
        numbers.add(1);
        System.out.println(sum(numbers));
    }

    public static int sum(ArrayList<Integer> numbers){
        int sum=0;
        for(int x=0;x<numbers.size();x++){
            sum+=numbers.get(x);
        }

        return sum;
    }

}
