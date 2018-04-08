import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics evenSum = new NumberStatistics();
        NumberStatistics oddSum = new NumberStatistics();
        // Write test code here
        // Remember to remove all the extra code when doing assignments  79.3 and 79.4

        // Define three NumberStatistics objects in your program:
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.

        // The tests does not work if you do not create the objects in the correct order
        System.out.println("Type numbers:");

        while (true) {
            int input = Integer.parseInt(reader.nextLine());
            if (input == -1) {
                break;
            }
            if (input % 2 == 0) {
                evenSum.addNumber(input);
            } else {
                oddSum.addNumber(input);
            }
            stats.addNumber(input);
        }
        System.out.println("Sum: "+stats.sum());
        System.out.println("Sum of even: "+evenSum.sum());
        System.out.println("Sum of odd: "+oddSum.sum());

    }
}
