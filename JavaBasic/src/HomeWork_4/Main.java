package HomeWork_4;

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
    }

}
