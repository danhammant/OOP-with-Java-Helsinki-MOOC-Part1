import java.util.ArrayList;
import java.util.Collections;

public class Grades {
    private ArrayList<Integer> grades;
    private int scoreCount;

    public Grades() {
        this.grades = new ArrayList<Integer>();
        this.scoreCount = 0;
    }

    public void addScore(int score) {
        int grade;

        if (score < 30) {
            grade = 0;
        } else if (score < 35) {
            grade = 1;
        } else if (score < 40) {
            grade = 2;
        } else if (score < 45) {
            grade = 3;
        } else if (score < 50) {
            grade = 4;
        } else {
            grade = 5;
        }

        this.grades.add(grade);
        this.scoreCount ++;
    }


    public void printDistribution() {
        System.out.println("Grade distribution: ");

        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");

            for (int j = 0; j < distribution(i); j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        System.out.println("Acceptance percentage: " + acceptance());

    }

    private int distribution(int grade){
        return Collections.frequency(this.grades, grade);
    }

    private double acceptance() {
        int failCounter = 0;
        for (int grade : grades) {
            if (grade <= 0) {
                failCounter++;
            }
        }

        int accepted = this.grades.size() - failCounter;
        double acceptanceRate = (double) 100 * accepted / this.scoreCount;

        return acceptanceRate;
    }


}
