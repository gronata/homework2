public class Horse extends Animal {
    private double speed;
    private String name;

    public Horse(String food, String location, double speed, String name) {
        super(food, location, name);
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @Override
    public String checkType() {
        return "Лошадь:";
    }
}
