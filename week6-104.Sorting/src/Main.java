import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // write testcode here
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];

        for (int number : array) {
            if (number < smallest) {
                smallest = number;
            }
        }

        return smallest;
    }

    public static int indexOfTheSmallest(int[] array) {
        return indexOfTheSmallestStartingFrom(array, 0);
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int indexOfSmallest = index;
        int numberInIndex = array[index];

        for (int i = index; i < array.length; i++) {
            if (array[i] < numberInIndex) {
                indexOfSmallest = i;
                numberInIndex = array[i];
            }
        }

        return indexOfSmallest;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp1 = array[index1];
        int temp2 = array[index2];

        array[index1] = temp2;
        array[index2] = temp1;
    }

    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            int number = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, number);
            System.out.println(Arrays.toString(array));
        }
    }

}
