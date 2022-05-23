package Matrix;

import java.util.Scanner;

public class Transpose extends createdMatrix {

    public static int [][] transpose(int [] [] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array[i].length; j++) {
                int temp = array[i][j];
                array[i][j] = array[j][i];
                array[j][i] = temp;
            }
        }
        return array;
    }

    public static void showNewArray(int [][] array){
        System.out.println();
        System.out.println("Новая матрица");
        System.out.println("------");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%3d", array[i][j]);
            }
            System.out.println();
        }
    }
}
