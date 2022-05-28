package Person;

import java.security.SecureRandom;
import java.util.ArrayList;

public class Generate {


    public static ArrayList generatePerson(ArrayList person, int size) {
        SecureRandom random = new SecureRandom();
        String[] surname = {"Williams", "Peters", "Gibson", "Martin", "Jordan", "Jackson", "Grant", "Davis","Bradley "};
        String[] names = {"Oliver", "Jack", "Harry", "Jacob", "Charley", "Thomas", "George", "Oscar ", "Phillip"};
        for (int i = 0; i < size; i++) {
            int index = random.nextInt(names.length);
            int age = 10 + (int) (Math.random() * 100);
            person.add(new Person(names[index],surname[index], age, generateWeight(age), generateHeight(age)));
        }
        return person;
    }

    public static int generateWeight(int age) {
        int weight = 0;
        if (age == 10) {
            weight = 10 + (int) (Math.random() * 30);
        } else if (age > 10 && age <= 20) {
            weight = 40 + (int) (Math.random() * 60);
        } else if (age > 20) {
            weight = 40 + (int) (Math.random() * 80);
        }
        return weight;
    }

    public static int generateHeight(int age) {
        int height = 0;
        if (age == 10) {
            height = 80 + (int) (Math.random() * 100);
        } else if (age > 10 && age <= 20) {
            height = 110 + (int) (Math.random() * 100);
        } else if (age > 20) {
            height = 120 + (int) (Math.random() * 100);
        }
        return height;
    }

}
