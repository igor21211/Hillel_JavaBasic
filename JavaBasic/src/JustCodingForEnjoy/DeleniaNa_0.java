package JustCodingForEnjoy;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class DeleniaNa_0 {

    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int [] a = {3,4,6};

        try {
            System.out.println(a[b] / 0);
        }catch (ArrayIndexOutOfBoundsException u){
            System.err.println("Недопустимый элемент масива");
        }catch (ArithmeticException e){
            System.err.println("На ноль делить нельзя");
        }
        System.out.println("Coding for enjoy");
    }
}
