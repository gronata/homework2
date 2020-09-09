public class Horse extends Animal {
    private double speed;

    public Horse(String food, String location, double speed) {
        super(food, location);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
