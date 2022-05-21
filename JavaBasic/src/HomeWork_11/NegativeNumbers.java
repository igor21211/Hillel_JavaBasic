package HomeWork_11;

public class NegativeNumbers {
    public static void main(String[] args) {
        int [] [] array = {{2,6,4,8,6,-4,-6,-10},{10,2,56,8,5,43,-2,-34,23},{4,54,12,67,8,6,2},{-23,-4,4,2,65,4}};
        searcNegativNumber(array);
    }

    public static void searcNegativNumber(int [] [] array){
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0){
                    System.out.println(i + " " + j+ " число: " + array[i][j]);
                }
            }
        }
    }
}
