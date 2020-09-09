public class Cat extends Animal {
    private String type;

    public Cat() {
    }
    public Cat(String type) {
        this.type = type;
    }

    public Cat(String food, String location, String type) {
        super(food, location);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
