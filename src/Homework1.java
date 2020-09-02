import java.util.Scanner;

public class Homework1 {
    public static void main(String[] agrs) {
        Scanner input = new Scanner(System.in);
        System.out.println("Задание №1:");  // Ввести целое число и вывести на печать последнюю цифру
        System.out.println("Введите целое число:");
        int num = input.nextInt();
        int lastCharacter = num%10;
        System.out.printf("Последняя цифра : %d \n", lastCharacter);
        input.close();

        System.out.println("Задание №2:"); //ввести целое трехзначное число в консоли и найти сумму цифр этого трехзначного числа
        System.out.println("Введите трехзначное целое число:");
        int num2 = input.nextInt();
        int a = num2/100;
        int b = num2/10%10;
        int c = num2%100;
        int sum = a+b+c;
        System.out.printf("Сумма цифр равна : %d \n", sum );
        input.close();


    }

   }