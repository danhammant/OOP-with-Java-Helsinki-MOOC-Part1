public class Printing {

    public static void printStars(int amount) {
        // 39.1
        // you can print one star with the command
        // System.out.print("*");
        // call this command amount times
        int amountTimes = 0;
        while (amountTimes < amount) {
            System.out.print("*");
            amountTimes ++;
        }
        System.out.println("");
    }

    public static void printSquare(int sideSize) {
        // 39.2
        int amountTimes2 = 0;
        while (amountTimes2 < sideSize) {
            printStars(sideSize);
            amountTimes2++;
        }

    }

    public static void printRectangle(int width, int height) {
        // 39.3
        int amountTimes3 = 0;
        while (amountTimes3 < height) {
            printStars(width);
            amountTimes3++;
        }
    }

    public static void printTriangle(int size) {
        // 39.4
        int amountTimes4 = 0;
        int starAmount = 1;
        while (amountTimes4 < size) {
            printStars(starAmount);
            starAmount++;
            amountTimes4++;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(4);
        System.out.println("\n---");
    }

}
