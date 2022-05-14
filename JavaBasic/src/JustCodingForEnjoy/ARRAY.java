package JustCodingForEnjoy;

import HomeWork_8.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ARRAY {


    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        Integer integer = getNumber();
        System.out.println(integer);
        // code
        System.out.println("continue...");
    }

    private static Integer getNumber() throws IOException {
        try {
            System.out.println("input number:");
            String str = READER.readLine();
            return Integer.parseInt(str);
        } catch (NumberFormatException t) {
            System.err.println("Error" + t.getMessage());
            return getNumber();
        }
    }
}




