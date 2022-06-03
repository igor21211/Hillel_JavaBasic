package Tree;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Life extends Human {

    public Life(String name, String surname, String father, String mother) {
        super(surname,name, father, mother);
    }

    public Life(String name, String surname) {
        super(surname,name);
    }

    public static Object makeObject() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите фамилию");
        String surname = scanner.nextLine();
        System.out.println("Укажите Имя");
        String name = scanner.nextLine();
        System.out.println("Укажите имя отца");
        String father = scanner.nextLine();
        System.out.println("Укажите имя матери");
        String mother = scanner.nextLine();
        Human human = new Human(surname, name, father, mother);
        System.out.println("Обьект создан");
        return human;
    }


    public static void getFamyly(Object h1, Object h2, Object h3) {
        if (h1.equals(h2) && h1.equals(h3) && h2.equals(h3)) {
            System.out.println("Это семья " + h1.toString() + h2.toString() + h3.toString());
        } else {
            System.out.println("Это разные люди. " + h1.toString() + h2.toString() + h3.toString());
        }
    }

    public static void start() {
        getFamyly(makeObject(), makeObject(), makeObject());

    }

}