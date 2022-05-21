package HomeWork_10;

import java.util.Arrays;
import java.util.Scanner;

public class Lotery {

    public static int[] madeRandomArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        return array;
    }


    public static int[] madeUserArray(int[] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цифры в диапазоне от 0 до 9: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }


    public static void lotereyWin(int[] arrayOne, int[] arrayTwo) {
        int count = 0;
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        System.out.print("Числа которые совпали: ");
        for (int i = 0; i < 7; i++) {
            if (arrayOne[i] == arrayTwo[i]) {
                System.out.print(i + 1 + "-й ");
                count++;
            }
        }
        System.out.println("Элемент");
        System.out.println("Рандом масив: " + Arrays.toString(arrayOne));
        System.out.println("Юзера масив: " + Arrays.toString(arrayTwo));
        System.out.println("Всего совпадений: " + count);

    }

    public static void main(String[] args) {
        int[] arrayOne = new int[7];
        int[] arrayUsers = new int[7];
        madeRandomArray(arrayOne);
        madeUserArray(arrayUsers);
        lotereyWin(arrayOne, arrayUsers);



    }



}

