import java.util.Arrays;
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
        Scanner input2 = new Scanner(System.in);
        System.out.println("Задание №2:"); //ввести целое трехзначное число в консоли и найти сумму цифр этого трехзначного числа
        System.out.println("Введите трехзначное целое число:");
        int num2 = input2.nextInt();
        int a = num2/100;
        int b = num2/10%10;
        int c = num2%10;
        int sum = a+b+c;
        System.out.printf(" : %d \n", sum);
        input2.close();
        Scanner input3 = new Scanner(System.in);
        System.out.println("Задание №3:"); //ввести целое число в консоли. Если число положительное то прибавить к нему 1, в противном случае ничего не изменять. Вывести число
        System.out.println("Введите целое число положительное или отрицательное:");
        int num3 = input3.nextInt();
       if (num3>0){
           num3++;
       }
        System.out.printf(" : %d \n", num3);
        input3.close();
        Scanner input4 = new Scanner(System.in);
        System.out.println("Задание №4:"); //ввести целое число в консоли. Если число положительное то прибавить к нему 1, если отрицательное вычесть из него 2; если нулевым заменить его на 10. Вывести полученное число.
        System.out.println("Введите целое число (положетельное отрицательное либо 0):");
        int num4 = input4.nextInt();
        if (num4>0){
            num4++;
        }else if (num4 == 0){
            num4 = 10;
        }else if (num4<0){
            num4 = num4-2;
        }
        System.out.printf("num = %d \n", num4);
        input4.close();
        Scanner input51 = new Scanner(System.in);
        Scanner input52 = new Scanner(System.in);
        Scanner input53 = new Scanner(System.in);
        System.out.println("Задание №5:"); //ввести три целых числа в консоли. Вывести наэкран наименьшее.
        System.out.println("Введите целое число :");
        int num51 = input51.nextInt();
        System.out.println("Введите целое число :");
        int num52 = input52.nextInt();
        System.out.println("Введите целое число :");
        int num53 = input53.nextInt();
        int[] arr = {num51,num52,num53};
        Arrays.sort(arr);
        System.out.printf("min = %d \n",arr[0]);

    }

   }