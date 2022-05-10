package Comparable;

import java.util.Comparator;

public class ComperatorCar implements Comparator<Car> {

    @Override
    public int compare(Car o, Car o2) {
        if (o.year == o2.year) {
            return 0;
        } else if (o.year < o2.year) {
            return -1;
        } else {
            return 1;
        }
    }
}

