package HomeWork_5;

public class Eat  extends Animal{


    public int moneyForAll(int Dogs, int Cats , int money){
        return (money * (Dogs + Cats)) * 3;
    }

    public  int date(int day , int moneyForAll){
        return moneyForAll * day;
    }

}
