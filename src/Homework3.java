public class Homework3 {
public static void main(String[] args){
    System.out.println("Задание №1");
    Phone phone1 = new Phone("89267768712","samsung");
    phone1.weight = 200;
    System.out.println("Вывод:1 экземпляр");
    System.out.println("модель:" + phone1.model + " номер:" + phone1.getNumber() + " вес:" + phone1.weight);
    phone1.receiveCall("Natali");
    Phone phone2 = new Phone("89267473827","nokia",300);
    System.out.println("Вывод:2 экземпляр");
    System.out.println("модель:" + phone2.model + " номер:" + phone2.getNumber()+ " вес:" + phone2.weight);
    phone2.receiveCall("Serg");
    Phone phone3 = new Phone();
    phone3.number = "89162898";
    phone3.model = "mi";
    phone3.weight = 150;
    System.out.println("Вывод:3 экземпляр");
    System.out.println("модель:" + phone3.model + " номер:" + phone3.getNumber() + " вес:" + phone3.weight);
    phone3.receiveCall("Tolik");
    phone3.receiveCall(phone3.name,phone3.number);
    phone3.sendMessage(phone3.number);

    System.out.println("Задание №2");
    Animal[] animal = new Animal[3];
    Vet veterinary = new Vet();
    animal[0] = new Cat("мясо рыба","домашняя","персидский", "Кошка"  );
    animal[1] = new Horse("трава","Европа",60,"Лошадь");
    animal[2] = new Dog("все","весь мир",15, "Собака");

    for (int i=0; i<animal.length;i++){
        System.out.println(animal[i].checkType());
       veterinary.treatAnimal(animal[i]);
    }


    System.out.println("Задание №3");
    Student[] student = new Student[2];
    student[0] = new Aspirant("Alex","Ivanov",4,"UAI","Научное использование котиков");
    student[1] = new Student("Petr","Petrov",5,"yus");

    for (int i=0;i<student.length; i++){
        System.out.println("Студент: "+ student[i].getLastName() + " стипендия: " +student[i].getScholarship(student[i].getAverageMark()));
    }

    }
}
