import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private final int length;
    private String password = "";
    private String tempPassword = "";
    private char characters;
    private Random random = new Random();

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
        this.random.nextInt(26);
    }

    public String createPassword() {
        // write code that returns a randomized password
        int i = 0;
        while (i < this.length) {
            this.characters = "abcdefghijklmnopqrstuvwxyz".charAt(this.random.nextInt(26));
            this.tempPassword += this.characters;
            i++;
        }
        this.password = this.tempPassword;
        this.tempPassword = "";

        return this.password;
    }
}
