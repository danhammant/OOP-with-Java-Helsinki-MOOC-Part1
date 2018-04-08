import java.util.Random;

public class NightSky {
    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;

    public NightSky(double density) {
        this (density, 20, 10);
    }

    public NightSky(int width, int height) {
        this (0.1, width, height);
    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.height = height;
        this.width = width;
    }

    public void printLine() {
        for (int i = 0; i < this.width; i++) {
            double whiteOrStar = new Random().nextDouble();

            if (whiteOrStar > this.density) {
                System.out.print("");
            } else {
                System.out.print("*");
                this.starsInLastPrint += 1;
            }
        }
    }

    public void print() {
        this.starsInLastPrint = 0;
        for (int i = 0; i < this.height; i++) {
            printLine();
            System.out.println();
        }
    }

    public int starsInLastPrint() {


        return this.starsInLastPrint;
    }




}
