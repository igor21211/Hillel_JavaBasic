package Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class createdMatrix {
    static Scanner scanner = new Scanner(System.in);

    public static int [] [] madeMAtrix(){
        System.out.println("Введите размер задаваемой матрицы: MxN  ");
        int sizeOne = scanner.nextInt();
        int sizeTwo = scanner.nextInt();
        System.out.println("Введите значение в матрицу: ");
        int[][] a = new int[sizeOne][sizeTwo];
        for (int i = 0; i < sizeOne; i++) {
            for (int j = 0; j < sizeTwo; j++) {
                a[i][j] = scanner.nextInt()*i + j;
            }
        }
        return a;
    }

    public static void showMatrix(int[][]a){
        System.out.println("Начальная матрица");
        System.out.println("------");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.printf("%4d", a[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int [] [] matrix =  madeMAtrix();
        showMatrix(matrix);

    }
}
