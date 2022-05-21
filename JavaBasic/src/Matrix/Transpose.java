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

//    public static void main(String[] args) {
//
//        // часть 1 - создаем матрицу n на n
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        System.out.println("Введите размер задаваемой матрицы: MxN  ");
//        int sizeOne = scanner.nextInt();
//        int sizeTwo = scanner.nextInt();
//        int[][] a = new int[n][n];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                a[i][j] = n*i + j;
//            }
//        }
//
//        // часть 2 - выводит на экран начальную матрицу
//        System.out.println("Начальная матрица");
//        System.out.println("------");
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.printf("%4d", a[i][j]);
//            }
//            System.out.println();
//        }
//
//        // часть 3 - транспонирование матрицы
//        for (int i = 0; i < n; i++) {
//            for (int j = i+1; j < n; j++) {
//                int temp = a[i][j];
//                a[i][j] = a[j][i];
//                a[j][i] = temp;
//            }
//        }
//
//        // часть 4 - выводит на экран транспонированную матрицу
//        System.out.println();
//        System.out.println("Новая матрица");
//        System.out.println("------");
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.printf("%3d", a[i][j]);
//            }
//            System.out.println();
//        }
//
//    }
}
