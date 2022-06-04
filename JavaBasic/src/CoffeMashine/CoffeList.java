package CoffeMashine;

public enum CoffeList {

    Americano(25,1),
    Kapuchino(30,2),
    Tea(15,3);

    final int price;
    final int number;

    CoffeList(int price, int number) {
        this.price = price;
        this.number = number;
    }
}
