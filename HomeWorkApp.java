package DZ;

/* 1. Создать пустой проект в IntelliJ IDEA, создать класс HomeWorkApp, и прописать в нем метод main().

2. Создайте метод printThreeWords(), который при вызове должен отпечатать в столбец три слова: Orange, Banana, Apple.

3. Создайте метод checkSumSign(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, которыми захотите. Далее метод должен просуммировать эти переменные, и если их сумма больше или равна 0, то вывести в консоль сообщение “Сумма положительная”, в противном случае - “Сумма отрицательная”;

4. Создайте метод printColor() в теле которого задайте int переменную value и инициализируйте ее любым значением. Если value меньше 0 (0 включительно), то в консоль метод должен вывести сообщение “Красный”, если лежит в пределах от 0 (0 исключительно) до 100 (100 включительно), то “Желтый”, если больше 100 (100 исключительно) - “Зеленый”;

5. Создайте метод compareNumbers(), в теле которого объявите две int переменные a и b, и инициализируйте их любыми значениями, которыми захотите. Если a больше или равно b, то необходимо вывести в консоль сообщение “a >= b”, в противном случае “a < b” */


public class HomeWorkApp {
    public static void main(String... args) {
        printThreeWords();
        checkSumSing();
        printColor();
        compareNumbers();
        helloMister();
        yearV();

    }

    public static void printThreeWords() {
        System.out.println("Orange" + "\n" + "Banana" + "\n" + "Apple");
    }

    public static void checkSumSing() {
        int A = -4;
        // int A = 2 ;
        int B = 1;
        int result = A + B;
        if (result >= 0) {
            System.out.println("сумма положительная");
        } else {
            System.out.println("сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 0;
        if (value > 0 && value <= 100) {
            System.out.println("желтый");
        } else if (value <= 0) {
            System.out.println("красный");
        } else {
            System.out.println("зелёный");
        }
    }

    public static void compareNumbers() {
        int a = 1;
        int b = 2;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

    /*
    7.Написать метод, которому в качестве параметра передается строка, обозначающая имя.
    Метод должен вывести в консоль сообщение «Привет, указанное_имя!».

    8. *Написать метод, который определяет, является ли год високосным, и выводит сообщение в
    консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й –
    високосный.
     */
    public static void helloMister() {
        String name = "Абдул";
        System.out.println("Привет, " + name + "!");
    }

    public static void yearV() {
        int year = 400;
        if (year % 4 == 0 || year % 400 ==0 ^ year % 100 == 0 ) {
            System.out.println("год високосный");
        } else {
            System.out.println("год не високосный");
        }
    }
}