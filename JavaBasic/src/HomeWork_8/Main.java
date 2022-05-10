package HomeWork_8;

import HomeWork_8.Eat;

public class Main {
    public static void main(String[] args) {
        Eat eat = new Eat();
       int result = eat.date(24, eat.moneyForAll(eat.getDogs(), eat.getCats(), 2));
        System.out.println(result);
    }
}
