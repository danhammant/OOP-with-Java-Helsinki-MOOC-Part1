import java.util.ArrayList;

public class Database {
    private ArrayList<Bird> birds;

    public Database() {
        birds = new ArrayList<Bird>();
    }

    public void addBird(Bird bird) {
        this.birds.add(bird);
    }

    public void observation(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
                bird.setObservation();
            }
        }

        if (!isBird(name)) {
            System.out.println("Is not a bird!");
        }
    }

    public void statistics() {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }


    public void show(String name) {
        for (Bird bird : this.birds) {
            if (bird.getName().contains(name)) {
                System.out.println(bird);
            }
        }
    }

    private boolean isBird (String name) {
        for (Bird bird : this.birds) {
            if (bird.getName().equals(name)) {
                return true;
            }
        }

        return false;

    }




}
