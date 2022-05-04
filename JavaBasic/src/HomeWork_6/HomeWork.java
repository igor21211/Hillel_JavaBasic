package HomeWork_6;

public class HomeWork {

    public static double abc(int a, int b, int c) {
        return Math.abs(a - b) / Math.pow((a + b), 3) - Math.sqrt(c);
    }

    public static void main(String[] args) {

        System.out.println(abc(3, 4, 6));
    }
}
