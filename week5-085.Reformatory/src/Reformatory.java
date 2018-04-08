public class Reformatory {
    private int measuredCounter = 0;


    public int weight(Person person) {
        this.measuredCounter++;
        // return the weight of the person
        return person.getWeight();
    }

    public void feed(Person person) {
        int feeder = person.getWeight() + 1;
        person.setWeight(feeder);
    }

    public int totalWeightsMeasured() {

        return this.measuredCounter;
    }

}
