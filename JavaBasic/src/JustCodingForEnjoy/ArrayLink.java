package JustCodingForEnjoy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayLink {

    public static void main(String[] args) {

        String[] strings = new String[3];
        fillArray(strings);
        printArray(strings);
        System.out.println("strings link " + strings);

        String[] anotherStrings = strings;
        System.out.println("anotherStrings link " + anotherStrings);

        anotherStrings[0] = "new text";

        System.out.println(strings[0]);
        System.out.println(anotherStrings[0]);

        String[] newStrings = createAndFill(10);
        printArray(newStrings);

        Integer [] a = {2,3,5,7,23,32,5621,6,3,1,3,5,7,4,4};




    }

    public static void fillArray(String[] strings) {
        for (int i = 0; i < strings.length; i++) {
            strings[i] = "str" + i;
        }
    }

    public static void printArray(String[] strings) {
        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static String[] createAndFill(int size) {
        String[] strings = new String[size];
        fillArray(strings);
        return strings;
    }



}

