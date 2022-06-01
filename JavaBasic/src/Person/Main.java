package Person;

import java.util.ArrayList;

public class Main  {
    public static void main(String[] args) {
        ArrayList<Person>person = new ArrayList<Person>();
        Generate.generatePerson(person,100);
        System.out.println(person.toString());



    }

}
