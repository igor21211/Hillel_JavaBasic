package HomeWork_9;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class chekArray {

    public static void main(String[] args) {
        int [] array = createArray();
        System.out.println("Теперь проверим его на строгую последовательность: ");
        if (chekArray(array) == true) {
            System.out.println("Да! определённо здесь сохранена строгая последовательность");
        } else {
            System.out.println("К сожалению здесь все значения разбросанны");
        }


    }


    public static boolean chekArray(int[] array) {
        boolean chek = false;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                chek = false;
                break;
            } else {
                chek = true;
            }
        }
        return chek;
    }

    public static int[] createArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер создаваемоего масива: ");
        int[] array = new int[scanner.nextInt()];
        System.out.println("Готово!");
        System.out.println("Вводите значения которые мы запишем в масив");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
}
