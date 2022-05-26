package Cat;

public class Main extends Cat{
    public static void main(String[] args) {
        Cat cat = new Cat("Tyzik",2,12,"Bombay");
        Cat cat1 = new Cat("Vasya",2,12,"British Longhair");
        Cat cat2 = new Cat("Princes" , 3,23,"Brazilian");
        System.out.println(cat.toString());
        System.out.println(cat1.toString());
        System.out.println(cat2.toString());
        System.out.println(cat.equals(cat1));//true
        System.out.println(cat.equals(cat2));//false
    }
}
