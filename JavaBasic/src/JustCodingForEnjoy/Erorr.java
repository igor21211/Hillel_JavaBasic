package JustCodingForEnjoy;

import java.io.IOException;
import java.util.Scanner;

public class Erorr {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int[] a = {3, 4, 6};

        try {
            System.out.println(a[b] / 0);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException u) {
            System.err.println("Ошибка");

            System.out.println("Coding for enjoy");
        }
    }
}