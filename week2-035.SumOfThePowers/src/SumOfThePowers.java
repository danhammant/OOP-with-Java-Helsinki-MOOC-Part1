
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int result = Integer.parseInt(reader.nextLine());
        int number = 0;

        int sum = 0;
        while (number <= result) {
            sum += (int)Math.pow(2, number);
            number++;

        }
        System.out.println("The result is "+sum);

    }
}
