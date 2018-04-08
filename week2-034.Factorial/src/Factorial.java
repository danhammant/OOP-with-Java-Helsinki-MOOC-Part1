import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int result = Integer.parseInt(reader.nextLine());

        int number = 1;
        int sum = 1;
        while (number <= result) {
            sum *= number;
            number ++;
        }
        System.out.println("Factorial is "+sum);

    }
}
