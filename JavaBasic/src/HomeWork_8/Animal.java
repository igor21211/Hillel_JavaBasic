package HomeWork_8;

public class Animal {

    private int Cats = 8;
    private int Dogs = 24;
    private int money = 2;
    private int part = 50;

    public int getPart() {
        return part;
    }

    public int getMoney() {
        return money;
    }

    public int getCats() {

        return Cats;
    }

    public int getDogs() {

        return Dogs;
    }

    public void setCats(int cats) {

        Cats = cats;
    }

    public void setDogs(int dogs) {

        Dogs = dogs;
    }

    public int eatsForDogs(int Dogs, int part) {
        return this.Dogs * (this.part * 3);
    }

    public int eatsForCats(int Cats , int part) {
        return this.Cats * (this.part * 3);
    }

    public int eatForDogsAndCats(int Cats, int Dogs, int part) {

        return (this.Dogs + this.Cats) * (this.part * 3) ;
    }

    public int moneyForAll(int Cats, int Dogs, int money) {
        return (this.money * (this.Dogs + this.Cats)) * 3;
    }

    public int moneyForCats(int Cats, int money) {

        return (this.money * this.Cats) * 3;
    }

    public int moneyForDogs(int Dogs, int money) {

        return (this.money * this.Dogs) * 3;
    }




}
