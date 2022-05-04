package JustCodingForEnjoy;

import java.sql.SQLOutput;
import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        HashSet<Integer> myHash = new HashSet<>();
        myHash.add(2);
        myHash.add(1);
        myHash.add(3);
        System.out.println("Before remove");
        for (int i: myHash) {
            System.out.println(i);
        }

        myHash.remove(2);
        System.out.println("After remove");
        for (int i: myHash) {
            System.out.println(i);
        }


        System.out.println(myHash.isEmpty());

        System.out.println(myHash.contains(3));
        System.out.println(myHash.contains(6));

        System.out.println(myHash.size());

        myHash.clear();

        System.out.println(myHash.size());
        System.out.println(myHash.isEmpty());
    }

}
