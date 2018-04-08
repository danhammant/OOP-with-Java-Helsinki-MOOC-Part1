import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
        
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        Database birds = new Database();
        Scanner reader = new Scanner(System.in);

        while (true) {
            System.out.print("? ");
            String input = reader.nextLine();

            if (input.equals("Quit")) {
                break;

            } else if (input.equals("Add")) {
                System.out.print("Name: ");
                String name = reader.nextLine();
                System.out.print("Latin Name: ");
                String latin = reader.nextLine();

                Bird bird = new Bird(name, latin);
                birds.addBird(bird);

            } else if (input.equals("Observation")) {
                System.out.print("What was observed:? ");
                String name = reader.nextLine();
                birds.observation(name);

            } else if (input.equals("Statistics")) {
                birds.statistics();

            } else if (input.equals("Show")) {
                System.out.print("What? ");
                String name = reader.nextLine();
                birds.show(name);
            }
        }




            
    }

}
