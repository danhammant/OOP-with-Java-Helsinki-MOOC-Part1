
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        // Write your code here.
        while (true) {
            System.out.print("Type a temperature (between -30 and 40) or '150 to quit': ");
            double value = Double.parseDouble(reader.nextLine());
            if (value == 150) {
                break;
            } else if (value >= -30 && value<= 40){
                Graph.addNumber(value);
            } else {
                System.out.println("Out of range");
            }

        }


        // Graph is used as follows:
        //Graph.addNumber(7);
        //double value = 13.5;
        //Graph.addNumber(value);
        //value = 3;
        //Graph.addNumber(value);
        // Remove or comment out these lines above before trying to run the tests.
    }
}