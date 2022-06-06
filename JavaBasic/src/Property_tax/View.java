package Property_tax;

public enum View {

    Жилая(1),
    Торговая(2),
    Производственная(3);

    final int number;

    View(int number) {
        this.number = number;
    }
}
