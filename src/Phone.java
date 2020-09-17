//∎ Создайте класс Phone, который содержит переменные number,
//        model и weight.
//        ∎ Создайте три экземпляра этого класса.
//        ∎ Выведите на консоль значения их переменных.
//        ∎ Добавить в класс Phone методы: receiveCall, имеет один
//        параметр – имя звонящего. Выводит на консоль сообщение “Звонит
//        {name}”. getNumber – возвращает номер телефона. Вызвать эти
//        методы для каждого из объектов.
//        ∎ Добавить конструктор в класс Phone, который принимает на вход
//        три параметра для инициализации переменных класса - number,
//        model и weight.
//        ∎ Добавить конструктор, который принимает на вход два параметра
//        для инициализации переменных класса - number, model.
//        ∎ Добавить конструктор без параметров.
//        ∎ Вызвать из конструктора с тремя параметрами конструктор с
//        двумя.
//        ∎ Добавьте перегруженный метод receiveCall, который принимает
//        два параметра - имя звонящего и номер телефона звонящего.
//        Вызвать этот метод.
//        ∎ Создать метод sendMessage с аргументами переменной длины.
//        Данный метод принимает на вход номера телефонов, которым
//        будет отправлено сообщение. Метод выводит на консоль номера
//        этих телефонов.

public class Phone {
    private String number;
    private String model;
    private String name;
    private double weight;

    public Phone() {
    }

    public String getModel() {
        return model;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) {
        this(number,model);
        this.weight = weight;
    }

    public void receiveCall(String name){
    this.name = name;
    System.out.println("Звонит " + this.name);
    }
    public void receiveCall(String name,String number ){
        this.name = name;
        this.number = number;
        System.out.println("Звонит " + this.name + " номер " + this.number);
    }

    public String getNumber() {
        return number;
    }
    public void sendMessage (String number){
        System.out.println("Номер телефона " + number);
    }
}
