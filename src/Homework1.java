import java.util.Scanner;

public class Homework1 {
    // Ввести целое число и вывести на печать последнюю цифру
    public static void main(String[] agrs) {
        Scanner input = new Scanner(System.in);
        System.out.println("Задание №1:");
        System.out.println("Введите целое число:");
        int num = input.nextInt();
        int lastCharacter = num%10;
        System.out.printf("Последняя цифра : %d \n", lastCharacter);
        input.close();
    }

   }