package JustCodingForEnjoy;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayvsLinkedList {

    public static void main(String[] args) {
        ArrayList<String> myArraylist = new ArrayList<>();

        myArraylist.add("Maks");
        myArraylist.add(1,"Oleg");
        myArraylist.add(1,"Jeka");
        myArraylist.set(2,"Kiril");

        System.out.println(myArraylist);
        System.out.println(myArraylist.indexOf("Oleg"));

    }
}
