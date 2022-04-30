package HomeWork_5;

public class Test {
    public static void main(String[] args) {

        System.out.println(Math.PI);
        double x = 28;
        double y = 4;

        // Возвращает максимум из 2 чисел
        System.out.println("максимум из 2 чисел: " +Math.max(x, y));

        // возвращает квадратный корень
        System.out.println("квадратный корень : " + Math.sqrt(y));

        //возвращает основание, возведённое в степень показатель
        System.out.println("возведённое в степень : " + Math.pow(x, y));

        //вернуть логарифм заданного значения
        System.out.println("Логарифм x : " + Math.log(x));
        System.out.println("Логарифм y : " + Math.log(y));

        //вернуть логарифм заданного значения, когда основание равно 10
        System.out.println("Лог10 x : " + Math.log10(x));
        System.out.println("Лог10 y : " + Math.log10(y));

        // вернуть журнал x + 1
        System.out.println("журнал из x : " +Math.log1p(x));

        // вернуть степень 2
        System.out.println("exp of a is: " +Math.exp(x));

        // return (a power of 2)-1
        System.out.println("expm1 of a is: " +Math.expm1(x));

        double a = 30;

        // converting values to radian
        double b = Math.toRadians(a);

        // return the trigonometric sine of a
        System.out.println("Sine value of a is: " +Math.sin(a));

        // return the trigonometric cosine value of a
        System.out.println("Cosine value of a is: " +Math.cos(a));

        // return the trigonometric tangent value of a
        System.out.println("Tangent value of a is: " +Math.tan(a));

        // return the trigonometric arc sine of a
        System.out.println("Sine value of a is: " +Math.asin(a));

        // return the trigonometric arc cosine value of a
        System.out.println("Cosine value of a is: " +Math.acos(a));

        // return the trigonometric arc tangent value of a
        System.out.println("Tangent value of a is: " +Math.atan(a));

        // return the hyperbolic sine of a
        System.out.println("Sine value of a is: " +Math.sinh(a));

        // return the hyperbolic cosine value of a
        System.out.println("Cosine value of a is: " +Math.cosh(a));

        // return the hyperbolic tangent value of a
        System.out.println("Tangent value of a is: " +Math.tanh(a));



    }
}
