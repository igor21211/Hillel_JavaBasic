package HomeWork_9;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArray {


    public static void main(String[] args) {
        int[] bigArray = new int[20];
        makeTwoArray(bigArray);
    }



    public static void makeTwoArray(int[] array) {
        int[] arraySmall;
        int[] array2small;
        Scanner scanner = new Scanner(System.in);
        arraySmall = new int[array.length / 2];
        array2small = new int[array.length / 2];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }


        for (int i = 0, j = 10; j < array.length; i++, j++) {
            arraySmall[i] = array[i];
            array2small[i] = array[j];
        }
        System.out.println("Большой масив: " + Arrays.toString(array));
        System.out.println("Первый маленький масив: " + Arrays.toString(arraySmall));
        System.out.print("Второе маленький масив: " + Arrays.toString(array2small));


    }

}
