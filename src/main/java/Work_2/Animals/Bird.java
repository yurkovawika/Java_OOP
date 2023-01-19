package Work_2.Animals;

public abstract class Bird implements Animals {

    private int flightAltitude;  //высота полёта

    protected Bird(int flightAltitude) {
        this.flightAltitude = flightAltitude;
    }
    protected Bird() {
    }
    protected void fly() {
        System.out.printf("I'm flying at altitude: %s\n", flightAltitude);
    }

    @Override
    public void makeSound() {

    }

    @Override
    public String print() {
        return String.format("flight altitude: %s ", this.flightAltitude);
    }
}
