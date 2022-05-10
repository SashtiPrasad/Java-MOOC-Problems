public class _34_AdvancedAstrology {
    public static void printStars(int number) {
        // part 1 of the exercise
        for(int x=1;x<=number;x++){
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for(int x=1;x<=number;x++){
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int space=size;
        for(int x=1;x<=size;x++){
            printSpaces((space-1));
            printStars(x);
            space--;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int spacing=height;
        for(int x=1;x<=(height+(height-1));x+=2){
            printSpaces(spacing-1);
            printStars(x);
            spacing--;
        }
        printSpaces(height-2);
        System.out.println("***");
        printSpaces(height-2);
        System.out.println("***");
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
