public class Dog extends Animal {
    private double weight;
    private String name;

    public Dog(String food, String location, double weight, String name) {
        super(food, location, name);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String checkType() {
        return "Собака:";
    }
}
