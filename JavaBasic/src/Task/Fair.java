package Task;

public class Fair {
    public static int[] plusarray(int[] array, int a) {
        int[] array2 = new int[array.length + 1];
        for (int i = 0; i < array2.length - 1; i++) {
            array2[i] = array[i];
        }
        array2[array2.length - 1] = a;
        return array2;
    }


    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int[] array2 = plusarray(array,21);
        for (int a : array2){
            System.out.print(a + " ");
        }


    }
}
