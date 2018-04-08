import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        
        Scanner reader = new Scanner(System.in);

        System.out.println("Type numbers: ");
        int input = 0;
        int loopCounter = 0;
        int sum = 0;
        double average = 0;
        int even = 0;
        int odd = 0;

        while (input > -1) {
            input = Integer.parseInt(reader.nextLine());
            if (input > -1) {
                sum += input;
                loopCounter ++;
                average = (double) sum / loopCounter;

            }
            if ((input % 2 == 0) && (input > -1)) {
                even++;
            }
            if ((input % 2 != 0) && (input > -1))  {
                odd++;
            }


        }
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is "+sum);
        System.out.println("How many numbers: "+loopCounter);
        System.out.println("The average of the numbers is: "+average);
        System.out.println("Even numbers: "+even);
        System.out.println("Odd numbers: "+odd);



    }
}
