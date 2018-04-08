public class Main {
    public static void main(String[] args) {
        // write testcode here
        Counter count = new Counter(-1, false);

        System.out.println(count.value());

        count.decrease();
        count.decrease();
        count.decrease();

        System.out.println(count.value());

    }
}
