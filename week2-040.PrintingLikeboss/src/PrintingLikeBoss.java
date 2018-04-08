public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int times = 0;
        while (times < amount) {
            System.out.print("*");
            times++;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int times = 0;
        while (times < amount) {
            System.out.print(" ");
            times++;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int times = 1;
        int width = (size - times);
        while (times <= size) {
            printWhitespaces(width);
            printStars(times);
            times++;
            width--;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int times = 1;
        int width = (height - times);
        int addition = 0;
        while (times <= height) {
            printWhitespaces(width);
            printStars(times + addition);
            times++;
            width--;
            addition++;
        }
        int times2 = 0;
        while (times2 < 2) {
            printWhitespaces(height - 2);
            printStars(3);
            times2++;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        printTriangle(10);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
