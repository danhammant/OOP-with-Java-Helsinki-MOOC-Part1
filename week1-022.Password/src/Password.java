
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.

        // Write your code here
        while (true) {
            System.out.print("Type the password: ");
            String pass = reader.nextLine();
            if (pass.equals("carrot")) {
                System.out.println("Right!");
                System.out.println("");
                System.out.println("The secret is jryy qbar!");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }
    }
}
