public class Homework3 {
public static void main(String[] args){
    Phone phone1 = new Phone("89267768712","samsung");
    phone1.weight = 200;
    System.out.println("Вывод:1 экземпляр");
    System.out.println("модель:" + phone1.model + " номер:" + phone1.number + " вес:" + phone1.weight);
    phone1.receiveCall("Natali");
    phone1.getNumber();
    Phone phone2 = new Phone("89267473827","nokia",300);
    System.out.println("Вывод:2 экземпляр");
    System.out.println("модель:" + phone2.model + " номер:" + phone2.number + " вес:" + phone2.weight);
    phone1.receiveCall("Serg");
    phone2.getNumber();
    Phone phone3 = new Phone();
    phone3.number = "89162898";
    phone3.model = "mi";
    phone3.weight = 150;
    System.out.println("Вывод:3 экземпляр");
    System.out.println("модель:" + phone3.model + " номер:" + phone3.number + " вес:" + phone3.weight);
    phone1.receiveCall("Tolik");
    phone3.getNumber();
    phone3.receiveCall(phone3.name,phone3.number);
    phone3.sendMessage(phone3.number);
    }
}
