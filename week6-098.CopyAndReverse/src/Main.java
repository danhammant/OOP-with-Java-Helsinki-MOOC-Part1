import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here
        int[] original = {1, 2, 3, 4};
        int[] reverse = reverseCopy(original);


        System.out.println("original: " + Arrays.toString(original));
        System.out.println("reversed: " + Arrays.toString(reverse));

    }

    public static int[] copy (int[] array) {
        int[] copy = new int[array.length];

        for (int i = 0; i < copy.length; i++) {
            copy[i] = array[i];
        }

        return copy;
    }

    public static int[] reverseCopy(int[] array) {
        int[] reverseCopy = new int[array.length];
        int r = 0;

        for (int i = reverseCopy.length - 1; i >= 0; i--) {
            reverseCopy[r] = array[i];
            r++;
        }

        return reverseCopy;
    }

}
