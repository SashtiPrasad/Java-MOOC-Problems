
public class _21_PrintNeatly {
    //This problem is named as ArrayPrinter in the workspace.

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        // Write some code in here
        for(int x=0;x<array.length-1;x++){
            System.out.print(array[x]+", ");
        }
        System.out.print(array[array.length-1]);
    }
}
