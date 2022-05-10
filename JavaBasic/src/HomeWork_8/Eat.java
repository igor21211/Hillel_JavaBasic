package HomeWork_8;

import HomeWork_8.Animal;

public class Eat  extends Animal {


    public int moneyForAll(int Dogs, int Cats , int money){
        return (money * (Dogs + Cats)) * 3;
    }

    public  int date(int day , int moneyForAll){
        return moneyForAll * day;
    }

}
