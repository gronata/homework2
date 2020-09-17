public class Homework3 {
    public static void main(String[] args) {
        System.out.println("Задание №1");

        Phone[] phone = new Phone[3];
        phone[0] = new Phone("89267768712", "samsung");
        phone[0].setWeight(200);
        phone[0].receiveCall("Natali");
        phone[1] = new Phone("89267473827", "nokia", 300);
        phone[1].receiveCall("Serg");
        phone[2] = new Phone();
        phone[2].setNumber("89162898");
        phone[2].setModel("mi");
        phone[2].setWeight(150);
        phone[2].receiveCall("Tolik");
        phone[2].receiveCall(phone[2].getName(), phone[2].getNumber());
        phone[2].sendMessage(phone[2].getNumber());
        int count = 1;
        for (int i = 0; i < phone.length; i++) {
             System.out.println("Вывод:" + count +" экземпляр");
            System.out.println("модель:" + phone[i].getModel() + " номер:" + phone[i].getNumber() + " вес:" + phone[i].getWeight());
            count++;
        }


        System.out.println("Задание №2");
        Animal[] animal = new Animal[3];
        Vet veterinary = new Vet();
        animal[0] = new Cat("мясо рыба", "домашняя", "персидский", "Кошка");
        animal[1] = new Horse("трава", "Европа", 60, "Лошадь");
        animal[2] = new Dog("все", "весь мир", 15, "Собака");

        for (int i = 0; i < animal.length; i++) {
            System.out.println(animal[i].checkType());
            veterinary.treatAnimal(animal[i]);
        }


        System.out.println("Задание №3");
        Student[] student = new Student[2];
        student[0] = new Aspirant("Alex", "Ivanov", 4, "UAI", "Научное использование котиков");
        student[1] = new Student("Petr", "Petrov", 5, "yus");

        for (int i = 0; i < student.length; i++) {
            System.out.println("Студент: " + student[i].getLastName() + " стипендия: " + student[i].getScholarship(student[i].getAverageMark()));
        }

    }
}
