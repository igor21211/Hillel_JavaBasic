package Person;


import java.security.SecureRandom;
import java.util.ArrayList;

public class Person {

   String name;
   String surname;
   int age;
   int weight;
   int height;




    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age, int weight, int height) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    public static void showArray(ArrayList person){
        System.out.println(person.toString());
    }


}
