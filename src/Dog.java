public class Dog extends Animal {
    private double weight;

    public Dog(String food, String location, double weight) {
        super(food, location);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
