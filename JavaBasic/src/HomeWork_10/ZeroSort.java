package HomeWork_10;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ZeroSort {
    public static void zeroSort(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1] && array[i] >= 0) {
                temp = array[i + 1];
                array[i + 1] = array[i];
                array[i] = temp;

            }
        }
        if (array[0] == 0 && array[1] == 0) {
            System.out.println(Arrays.toString(array));
        } else {
            zeroSort(array);
        }
    }

    public static void sortArray(int[] array) {
        int[] array2 = new int[array.length];
        int numberSortArray = 0;
        int numberSide = 0;
        for (int i : array) {
            if (i == 0) {
                array2[numberSortArray] = i;
                numberSortArray++;
            } else {
                array2[array.length - 1 - numberSide] = i;
                numberSide++;
            }
        }
        System.out.println(Arrays.toString(array2));
    }


    public static void main(String[] args) {
        int[] array = {2, 1, 5, 2, 0, 3, 0, 4, 4, 3, -5, 4};
        zeroSort(array); // один способ сортировки
        sortArray(array);// 2 способ создания нового масива и распределение значений по масиву


    }
}
