import java.util.Arrays;
import java.util.Scanner;

public class homework {
public homework() {

}

    public static void main(String[] agrs) {
        Scanner input = new Scanner(System.in);
        System.out.println("Задание №1:");
        System.out.println("Введите целое число:");
        int num = input.nextInt();
        int lastCharacter = num % 10;
        System.out.printf("Последняя цифра : %d \n", lastCharacter);
        Scanner input2 = new Scanner(System.in);
        System.out.println("Задание №2:");
        System.out.println("Введите трехзначное целое число:");
        int num2 = input2.nextInt();
        int sum = 0;
        while(num2 != 0){
            sum += (num2% 10);
            num2/=10;
        }
//        int a = num2 / 100;
//        int b = num2 / 10 % 10;
//        int c = num2 % 10;
//        int sum = a + b + c;
        System.out.printf("Сумма цифр = %d \n", sum);
        Scanner input3 = new Scanner(System.in);
        System.out.println("Задание №3:");
        System.out.println("Введите целое число положительное или отрицательное:");
        int num3 = input3.nextInt();
        if (num3 > 0) {
            ++num3;
        }

        System.out.printf(" : %d \n", num3);
        Scanner input4 = new Scanner(System.in);
        System.out.println("Задание №4:");
        System.out.println("Введите целое число (положетельное отрицательное либо 0):");
        int num4 = input4.nextInt();
        if (num4 > 0) {
            ++num4;
        } else if (num4 == 0) {
            num4 = 10;
        } else if (num4 < 0) {
            num4 -= 2;
        }

        System.out.printf("num = %d \n", num4);
        Scanner input51 = new Scanner(System.in);
        Scanner input52 = new Scanner(System.in);
        Scanner input53 = new Scanner(System.in);
        System.out.println("Задание №5:");
        System.out.println("Введите целое число :");
        int num51 = input51.nextInt();
        System.out.println("Введите целое число :");
        int num52 = input52.nextInt();
        System.out.println("Введите целое число :");
        int num53 = input53.nextInt();
        int[] arr = new int[]{num51, num52, num53};
        int minValue = arr[0];
        for (int p = 0;p<arr.length;p++)
        {  if(arr[p] < minValue){

                minValue = arr[p];
                p++;
            }

        }

 //       Arrays.sort(arr);
        System.out.printf("min = %d \n", arr[0]);



        Scanner input6 = new Scanner(System.in);
        System.out.println("Задание №6:");
        System.out.println("Введите целое число :");
        int num6 = input6.nextInt();
        if (num6 > 0) {
            System.out.println("Положительное число");
        } else if (num6 == 0) {
            System.out.println("Число равно 0");
        } else if (num6 < 0) {
            System.out.println("Отрицательное число");
        }
       if (num6%2== 0) {
            System.out.println("Четное число");
        }
        else{
            System.out.println("Нечетное число");
        }
        Scanner input7 = new Scanner(System.in);
        System.out.println("Задание №7:");
        System.out.println("Введите код города(905,194,491,800):");
        int num7 = input7.nextInt();
        double cen10 = 10;
        switch(num7) {
            case 194:
                double cen194=cen10*1.98;
                System.out.println("Ростов, стоимость разговора = " + cen194);
                break;
            case 491:
                double cen491=cen10*2.9;
                System.out.println("Краснодар, стоимость разговора = " + cen491);
                break;
            case 800:
                double cen800=cen10*5;
                System.out.println("Краснодар, стоимость разговора = " + cen800);
                break;
            case 905:
                cen10 = 41.5D;
                double cen905=cen10*4.15;
                System.out.println("Москва, стоимость разговора = " + cen905);
                break;
            default:
                System.out.println("Кода города не существует!");
        }

        homework obj = new homework();
        int[] arr8 = obj.ex7();
        System.out.println("Задание №9:");
        int[] arr2 = new int[]{15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};
        int n = arr2.length;
       // int local = false;

        int l;
        for(l = 0; l < n / 2; ++l) {
            int local = arr2[n - l - 1];
            arr2[n - l - 1] = arr2[l];
            arr2[l] = local;
        }

        System.out.print("Массив = [");

        for(l = 0; l < n; ++l) {
            System.out.print(arr2[l] + ", ");
        }

        System.out.println("]");
        System.out.println("Задание №10:");
        int[] arr3 = new int[]{15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};

        int i;
        for(i = 0; i < arr3.length; ++i) {
            if (arr3[i] == 0) {
                for(int j = i + 1; j < arr3.length; ++j) {
                    if (arr3[j] != 0) {
                        int temp = arr3[j];
                        arr3[j] = arr3[i];
                        arr3[i] = temp;
                    }
                }
            }
        }

        System.out.print("Массив = [");

        for(i = 0; i < arr3.length; ++i) {
            System.out.print(arr3[i] + ", ");
        }

        System.out.println("]");
    }

    int[] ex7() {
         System.out.println("Задание №8:");
        int[] arr1 = new int[]{1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        Arrays.sort(arr1);
        int max = arr1[arr1.length - 1];
        int sumneg = 0;
        int sumpos = 0;
        int countpos = 0;
        int countneg = 0;
        int sumallneg = 0;

        for(int k = 0; k < arr1.length; ++k) {
            if (arr1[k] < 0 & arr1[k] % 2 == 0) {
                sumneg += arr1[k];
            } else if (arr1[k] > 0) {
                sumpos += arr1[k];
                ++countpos;
            } else if (arr1[k] < 0) {
                ++countneg;
                sumallneg += arr1[k];
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