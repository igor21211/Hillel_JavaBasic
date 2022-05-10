package Comparable;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        ComperatorCar comperatorCar = new ComperatorCar();
        TreeSet<Car> cars = new TreeSet<Car>(comperatorCar);

        cars.add(new Car(25));
        cars.add(new Car(24));
        cars.add(new Car(5));
        cars.add(new Car(4));


        for (Object car : cars){
            System.out.println(car);
        }

    }
}
