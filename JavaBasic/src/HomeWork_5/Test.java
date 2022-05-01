package HomeWork_5;

public class Test {
    public static void main(String[] args) {

        System.out.println(Math.PI);
        double x = 28;
        double y = 4;
        double f = 26.76;

        // Возвращает максимум из 2 чисел
        System.out.println("максимум из 2 чисел: " +Math.max(x, y));

        // Возвращает минимум из 2 чисел
        System.out.println("минимум из 2 чисел: " +Math.min(x, y));

       //Используется для округления десятичных чисел до ближайшего значения.
        System.out.println("Округление числа  f : " + Math.round(f));

        //Используется для поиска наименьшего целочисленного значения, которое больше или равно аргументу или математическому целому числу
        System.out.println("Округление числа к большему  f : " + Math.ceil(f));

        //Используется для поиска наименьшего целочисленного значения, которое меньше или равно аргументу или математическому целому числу
        System.out.println("Округление числа к меньшему  f : " + Math.floor(f));

       //рандом из 0 до 1
        System.out.println("Рандом от 1 до 1 : " + Math.random());

        //рандом из 0 до 100 c помощью метода округления
        System.out.println("Рандом от 1 до 100 : " + Math.round(Math.random()* 100));

        //Используется для округления десятичных чисел до ближайшего значения.
        System.out.println("Округление числа  f : " + Math.round(f));

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

        //вертнет абсолютное значение заданого значения
        System.out.println("абсолютное значение заданого значения : " + Math.abs(x));





    }
}
