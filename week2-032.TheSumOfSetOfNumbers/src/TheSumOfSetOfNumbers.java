
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int i = 0;
        int sum = 0;

        System.out.print("Until what? ");
        int result = Integer.parseInt(reader.nextLine());

        while (i < result) {
            i ++;
            sum += i;

        }
        System.out.println("Sum is " + sum);

    }
}
