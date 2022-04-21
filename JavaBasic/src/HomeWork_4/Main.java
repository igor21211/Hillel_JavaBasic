package HomeWork_4;

import java.util.Scanner;

public class Main {
    public static int maxNumber(int [] array){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <array.length ; i++) {
            if(max < array[i]){
                max = array[i];
            }
        }
        return max;
    }

    public static int minNumber(int [] array){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length ; i++) {
            if(min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }


    public static void main(String[] args) {
        int [] array = {3,6,67,98,2,45,7,2};
        System.out.println(minNumber(array));
        System.out.println(maxNumber(array));
        System.out.println(sayName());
        System.out.println(sayAge());
        System.out.println(calculateFactorial(6));
    }

    public static String sayName(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static int sayAge(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    static int calculateFactorial(int n){
        int result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }
        return result;
    }



}
