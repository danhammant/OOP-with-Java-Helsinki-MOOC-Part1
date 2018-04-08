
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int number = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        int anotherNumber = Integer.parseInt(reader.nextLine());

        double sum = (double)number/anotherNumber;

        System.out.println("Division: "+number+" / "+anotherNumber+" = "+sum);


        // Implement your program here. Remember to ask the input from user.
    }
}
