package HomeWork_5;

public class Overloading {
    public static double sum(int a,int b){
        return a + b;
    }
    public static double sum(long a,long b){
        return a + b;
    }
    public static double sum(short a,short b){
        return a + b;
    }
    public static double sum(double a,double b){
        return a + b;
    }
    public static double sum(float a,float b){
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println( sum(3.4,2));
        System.out.println( sum(3545,2534534));
        System.out.println( sum(33345345,356345345));
        System.out.println( sum(434,2.4));

    }

}
