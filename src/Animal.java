public class Animal {
    //    Создать класс Animal и расширяющие его классы Dog, Cat, Horse.
//    Класс Animal содержит переменные food, location и методы
//    makeNoise, eat, sleep. Метод makeNoise, например, может выводить
//    на консоль "Такое
//
//            -то животное спит". Dog, Cat, Horse
//    переопределяют методы makeNoise, eat. Добавьте переменные в
//    классы Dog, Cat, Horse, характеризующие только этих животных.
//    Создайте класс Ветеринар, в котором определите метод void
//    treatAnimal(Animal animal). Пусть этот метод распечатывает food и
//    location пришедшего на прием животного. В методе main создайте
//    массив типа Animal, в который запишите животных всех имеющихся
//    у вас типов. В цикле отправляйте их на прием к ветеринару.
    private String food;
    private String location;
    private String name;

    public Animal() {
    }

    public Animal(String food, String location, String name) {
        this.food = food;
        this.location = location;
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void makeNoise(String name) {
        System.out.println(name + "животное спит");

    }

    public void eat(String food) {
        System.out.println("еда для животного" + food);

    }

    public void sleep(String name) {
        System.out.println("Животное спит: " + name);

    }

    public String checkType() {
        return "";
    }


}


