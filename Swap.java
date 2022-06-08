package HomeWorkApp10;

import java.util.Arrays;
import java.util.List;

public class Swap {
    public static void main(String[] args) {
        String[] arr = {"asd", "ds", "ret", "123"};

        System.out.println("Task 1\n" + Arrays.toString(arr));
        swapElements(arr, 1, 3);
        System.out.println(Arrays.toString(arr));
    }

    private static <T> void swapElements(T[] array, int ind1, int ind2) {
        T temp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = temp;
    }

    private static <E> List<E> convertToList(E[] array) {
        return Arrays.asList(array);
    }


}
