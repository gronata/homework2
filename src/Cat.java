public class Cat extends Animal {
    private String type;
    private String name;

    public Cat() {
    }
    public Cat(String type) {
        this.type = type;
    }

    public Cat(String food, String location, String type, String name) {
        super(food, location);
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    @Override
    public String checkType(){
        return "Кошка:";
    }
}
