package DZ;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/*
1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.

2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.

3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз;
 */
public class HomeWorkApp2 {
    public static void main(String[] args) {
        method1();
        method2();
        method3();
        method4();
        method5();
        method6();
        method7();
        method8();

    }

    public static void method1() {
        int A = ThreadLocalRandom.current().nextInt(15);
        int B = ThreadLocalRandom.current().nextInt(15);
        int result = A + B;
        System.out.println("A = " + A + "; B =  " + B );
        if (result <= 20 && result >= 10) {
            System.out.println("true");
        } else {
            System.out.println("False");
        }
    }

    public static void method2() {
        int A = ThreadLocalRandom.current().nextInt(8) - 5;
        if (A >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static void method3() {
        int A = ThreadLocalRandom.current().nextInt(8) - 5;
        if (A < 0) {
            System.out.println("True");
        } else if (A == 0) {
            System.out.println("Is it error?");
        } else {
            System.out.println("False");
        }
    }

    public static void method4() {
        String str = "Йогурт";
        for (int i = 0; i < 4; i++) {
            System.out.println(str);
        }
    }

// задание с високосными годами выполнил в прошлом файле


    /*
5. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

6. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

7. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

8. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

9. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);

10. ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.

11. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.
     */
    public static void method5() {
        int[] arr = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            }
        System.out.println(Arrays.toString(arr));
    }

    public static void method6() {
        int[] arr = new int[8];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i*3;
            System.out.println(arr[i]);
        }
    }

    public static void method7() {
        int[] arr = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void method8() {
        int[][] matrix = new int[4][4];
        for (int i = 0; i < 4; i++) {
            matrix[i][i] = 1;
            matrix[i][4 - i - 1] = 1;
        }
        System.out.println(Arrays.deepToString(matrix));
        for (int i = 0; i < 4; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}

