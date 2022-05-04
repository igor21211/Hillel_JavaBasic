package HomeWork_5;

public class Lessons_5 {
    private int a;
    private int b;
    private int c;


    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public Lessons_5(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public  int ob() {
        return a * b * c;
    }

    public static void main(String[] args) {
        Lessons_5 lessons_5 = new Lessons_5(3,4,6);
        System.out.println(lessons_5.ob());
    }
}
