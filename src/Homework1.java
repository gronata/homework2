import java.util.Arrays;
import java.util.Scanner;

public class Homework1 {
    public static void main(String[] agrs) {
        Scanner input = new Scanner(System.in);
        System.out.println("Задание №1:");  // Ввести целое число и вывести на печать последнюю цифру
        System.out.println("Введите целое число:");
        int num = input.nextInt();
        int lastCharacter = num % 10;
        System.out.printf("Последняя цифра : %d \n", lastCharacter);
        Scanner input2 = new Scanner(System.in);
        System.out.println("Задание №2:"); //ввести целое трехзначное число в консоли и найти сумму цифр этого трехзначного числа
        System.out.println("Введите трехзначное целое число:");
        int num2 = input2.nextInt();
        int a = num2 / 100;
        int b = num2 / 10 % 10;
        int c = num2 % 10;
        int sum = a + b + c;
        System.out.printf("Сумма цифр = %d \n", sum);
        Scanner input3 = new Scanner(System.in);
        System.out.println("Задание №3:"); //ввести целое число в консоли. Если число положительное то прибавить к нему 1, в противном случае ничего не изменять. Вывести число
        System.out.println("Введите целое число положительное или отрицательное:");
        int num3 = input3.nextInt();
        if (num3 > 0) {
            num3++;
        }
        System.out.printf(" : %d \n", num3);
        Scanner input4 = new Scanner(System.in);
        System.out.println("Задание №4:"); //ввести целое число в консоли. Если число положительное то прибавить к нему 1, если отрицательное вычесть из него 2; если нулевым заменить его на 10. Вывести полученное число.
        System.out.println("Введите целое число (положетельное отрицательное либо 0):");
        int num4 = input4.nextInt();
        if (num4 > 0) {
            num4++;
        } else if (num4 == 0) {
            num4 = 10;
        } else if (num4 < 0) {
            num4 = num4 - 2;
        }
        System.out.printf("num = %d \n", num4);

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
        int[] arr = {num51, num52, num53};
        Arrays.sort(arr);
        System.out.printf("min = %d \n", arr[0]);
        //6
        Scanner input6 = new Scanner(System.in);
        System.out.println("Задание №6:"); //ввести целое число в консоли.Вывести строку его описания: отрицательное, положительно, равно 0.
        System.out.println("Введите целое число :");
        int num6 = input6.nextInt();
        if (num6 > 0) {
            System.out.println("Положительное число");

        } else if (num6 == 0) {
            System.out.println("Число равно 0");
        } else if (num6 < 0) {
            System.out.println("Отрицательное число");


        }
            Scanner input7 = new Scanner(System.in);
            System.out.println("Задание №7:");
       /* 7. Написать программу, вычисляющую стоимость 10
        минутного междугороднего разговора в зависимости
        от кода города. ( Москва(905) - 4.15руб. Ростов(194) -
                1.98руб. Краснодар(491) - 2.69руб. Киров(800) - 5.00
        руб. ). Пользователь в консоли должен ввести код
        города, а в ответ от программы получить, например,
                при вводе кода 905- Москва Стоимость разговора*/
            System.out.println("Введите код города(905,194,491,800):");
            int num7 = input7.nextInt();
            switch (num7) {
                case 905:
                    double cen10 = 10 * 4.15;
                    System.out.println("Москва, стоимость разговора = " + cen10);
                    break;
                case 194:
                    cen10 = 10 * 1.98;
                    System.out.println("Ростов, стоимость разговора = " + cen10);
                    break;
                case 491:
                    cen10 = 10 * 2.69;
                    System.out.println("Краснодар, стоимость разговора = " + cen10);
                    break;
                case 800:
                    cen10 = 10 * 5;
                    System.out.println("Краснодар, стоимость разговора = " + cen10);
                    break;
                default:
                    System.out.println("Кода города не существует!");
            }

        Homework1 obj = new Homework1();
        int arr8[] = obj.ex7();

 /*     9  Дан массив целых чисел:
[15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52].
        Переставить элементы массива в обратном порядке. Вывести результат на консоль.
*/
            System.out.println("Задание №9:");
            int[] arr2 = {15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};
            int n = arr2.length;
            int local = 0;
            for (int m = 0; m < n / 2; m++) {
                local = arr2[n - m - 1];
                arr2[n - m - 1] = arr2[m];
                arr2[m] = local;
            }
            System.out.print("Массив = [");
            for (int l = 0; l < n; l++) {
                System.out.print(arr2[l] + ", ");
            }
            System.out.println("]");

        /*
        10. Дан массив целых чисел:
[15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52]. Переместить
нули в конец массива. Вывести результат в консоль
         */
            System.out.println("Задание №10:");
            int[] arr3 = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};
            int temp;
            for (int i = 0; i < arr3.length; i++) {
                if (arr3[i] == 0) {
                    for (int j = i + 1; j < arr3.length; j++) {
                        if (arr3[j] != 0) {
                            temp = arr3[j];
                            arr3[j] = arr3[i];
                            arr3[i] = temp;

                        }

                    }
                }
            }

            System.out.print("Массив = [");
            for (int i = 0; i < arr3.length; i++) {
                System.out.print(arr3[i] + ", ");
            }
            System.out.println("]");


        }



     int[] ex7 (){
        /*       8. Дан массив целых чисел:
[1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2]. Для данного
        массива найти и вывести на экран:
        - максимальное значение
                - сумму положительных элементов
        - сумму четных отрицательных элементов
                - количество положительных элементов
        - среднее арифметическое отрицательных элементов*/
            Scanner input8 = new Scanner(System.in);
            System.out.println("Задание №8:");
            int[] arr1 = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
            Arrays.sort(arr1);
            int max = arr1[arr1.length - 1];
            int sumneg = 0;
            int sumpos = 0;
            int countpos = 0;
            int countneg = 0;
            int sumallneg = 0;
            for (int k = 0; k < (arr1.length); k++) {
                if (arr1[k] < 0 & (arr1[k] % 2) == 0) {
                    sumneg = sumneg + arr1[k];
                } else if (arr1[k] > 0) {
                    sumpos = sumpos + arr1[k];
                    countpos++;
                } else if (arr1[k] < 0) {
                    countneg++;
                    sumallneg = sumallneg + arr1[k];
                }
            }
            System.out.println("Максимальное число массива = " + max);
            System.out.println("Cумма положительных элементов = " + sumpos);
            System.out.println("Сумма четных отрицательных элементов = " + sumneg);
            System.out.println("Количество положительных элементов= " + countpos);
            System.out.println("Среднее арифметическое отрицательных элементов= " + sumallneg / countneg);
        return arr1;
     }


    }

