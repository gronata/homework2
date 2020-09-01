import java.util.Scanner;

public class Homework1 {
    // Ввести целое число и вывести на печать последнюю цифру
    public static void main(String[] agrs) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите целое число:");
        int num = input.nextInt();
        System.out.printf("Последняя цифра : %d \n", getCountsOfDigits(num));
        input.close();
    }

    public static int getCountsOfDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }
}