
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("First: ");
        int lower = Integer.parseInt(reader.nextLine());

        System.out.print("Second: ");
        int upper = Integer.parseInt(reader.nextLine());

        int number = 1;
        int sum = 0;
        while (lower <= upper) {
            lower *= number;
            sum += lower;
            lower ++;
        }
        System.out.println("The sum is "+sum);
        
    }
}
