package HomeWorkApp9;

/*
1 Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. При
подаче массива другого размера необходимо бросить исключение MyArraySizeException.

2 Далее метод должен пройтись по всем элементам массива, преобразовать в int и
просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в
ячейке лежит символ или текст вместо числа), должно быть брошено исключение
MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.

3 В методе main() вызвать полученный метод, обработать возможные исключения
MyArraySizeException и MyArrayDataException и вывести результат расчета
 */

public class Main {
    public static void main(String[] args) {

        String[][] arr = new String[][]{{"1", "2", "3", "4",}, {"1", "2", "3", "4"}, {"1", "2", "2", "2"}, {"2", "2", "2","5"}};
        try {
            try {
                int result = method(arr);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Размер массива превышен!");
            }
        } catch (MyArrayDataException e) {
            System.out.println("Неправильное значение массива!");
        }

    }

    public static int method(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException();
                }
            }

        }
        return count;
    }

    private static class MyArraySizeException extends Throwable {
    }

    private static class MyArrayDataException extends Throwable {

    }
}