package DZ.HomeWorkApp12;
/*

Необходимо написать два метода, которые делают следующее:

1) Создают одномерный длинный массив, например:

static final int SIZE = 10 000 000;
static final int HALF = size / 2;
float[] arr = new float[size].

2) Заполняют этот массив единицами.

3) Засекают время выполнения: long a = System.currentTimeMillis().

4) Проходят по всему массиву и для каждой ячейки считают новое значение по формуле:
arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
Math.cos(0.4f + i / 2));

5) Проверяется время окончания метода System.currentTimeMillis().

6) В консоль выводится время работы: System.out.println(System.currentTimeMillis() - a

Отличие первого метода от второго:
? Первый просто бежит по массиву и вычисляет значения.
? Второй разбивает массив на два массива, в двух потоках высчитывает новые значения и
потом склеивает эти массивы обратно в один.

Пример деления одного массива на два:
? System.arraycopy(arr, 0, a1, 0, h);
? System.arraycopy(arr, h, a2, 0, h).

Пример обратной склейки:
? System.arraycopy(a1, 0, arr, 0, h);
? System.arraycopy(a2, 0, arr, h, h).

Примечание:
System.arraycopy() — копирует данные из одного массива в другой:
System.arraycopy(массив-источник, откуда начинаем брать данные из массива-источника,
массив-назначение, откуда начинаем записывать данные в массив-назначение, сколько ячеек
копируем)

По замерам времени:

Для первого метода надо считать время только на цикл расчета:
for (int i = 0; i < size; i++) {
arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
Math.cos(0.4f + i / 2));
}

Для второго метода замеряете время разбивки массива на 2, просчета каждого из двух массивов и
склейки.
 */
public class MainCl {
    private static final int SIZE = 90000000;
    private static final int HALF_SIZE = SIZE / 2;

    public float[] calculate(float[] arr) {
        for (int i = 0; i < arr.length; i++)
            arr[i] = (float) (arr[i] * Math.sin(0.2f + arr[i] / 5) * Math.cos(0.2f + arr[i] / 5) * Math.cos(0.2f + arr[i] / 2));
        return arr;
    }

    public void runOneThread() {
        float[] arr = new float[SIZE];
        for (int i = 0; i < arr.length; i++) arr[i] = 1.0f;
        long a = System.currentTimeMillis();
        calculate(arr);
        System.out.println("Скорость потока первого метода: " + (System.currentTimeMillis() - a));
    }

    public void runTwoThreads() {
        float[] arr = new float[SIZE];
        float[] arr1 = new float[HALF_SIZE];
        float[] arr2 = new float[HALF_SIZE];
        for (int i = 0; i < arr.length; i++) arr[i] = 1.0f;

        long a = System.currentTimeMillis();
        System.arraycopy(arr, 0, arr1, 0, HALF_SIZE);
        System.arraycopy(arr, HALF_SIZE, arr2, 0, HALF_SIZE);

        new Thread() {
            public void run() {
                float[] a1 = calculate(arr1);
                System.arraycopy(a1, 0, arr1, 0, a1.length);
            }
        }.start();

        new Thread() {
            public void run() {
                float[] a2 = calculate(arr2);
                System.arraycopy(a2, 0, arr2, 0, a2.length);
            }
        }.start();

        System.arraycopy(arr1, 0, arr, 0, HALF_SIZE);
        System.arraycopy(arr2, 0, arr, HALF_SIZE, HALF_SIZE);
        System.out.println("Скорость потока второго метода: " + (System.currentTimeMillis() - a));
    }

    public static void main(String s[]) {
        MainCl o = new MainCl();
        o.runOneThread();
        o.runTwoThreads();
    }
}