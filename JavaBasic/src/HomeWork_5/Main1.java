package HomeWork_5;

public class Main1 {
    public static void main(String[] args) {
        Eat eat = new Eat();
       int result = eat.date(24, eat.moneyForAll(eat.getDogs(), eat.getCats(), 2));
        System.out.println(result);
    }
}
