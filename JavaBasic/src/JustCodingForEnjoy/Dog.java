package JustCodingForEnjoy;

public class Dog {
    private String name;
    private String poroda;
    private int age;

    static int paws;

    static {
        paws = 4;
    }

    {
        System.out.println("Это екземпляр класа дог");
        name = "krem";
        poroda = "pydel";
        age = 5;
    }

    public Dog() {
    }

    public Dog(String name, String poroda, int age) {
        this.name = name;
        this.poroda = poroda;
        this.age = age;
    }

    public void sayDog() {
        System.out.println(this.name);
        System.out.println(this.poroda);
        System.out.println(this.age);
    }
}
