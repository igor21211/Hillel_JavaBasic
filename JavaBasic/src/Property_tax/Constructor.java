package Property_tax;

public class Constructor {

    private static double TAX = 1.2;
    String nameProperty;
    int square;
    int revenue;


    public static double getTAX() {
        return TAX;
    }

    public Constructor() {
    }

    public Constructor(String nameProperty, int square) {
        this.nameProperty = nameProperty;
        this.square = square;


    }

    public Constructor(String nameProperty, int square, int revenue) {
        this.nameProperty = nameProperty;
        this.square = square;
        this.revenue = revenue;

    }

    @Override
    public String toString() {
        return "Недвижимость \n" +
                "Вид недвижимости: " + nameProperty + '\n' +
                "площадь = " + square ;

    }


}
