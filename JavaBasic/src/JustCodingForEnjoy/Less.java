package JustCodingForEnjoy;

import org.jetbrains.annotations.NotNull;

public class Less {
    public static void main(String[] args) {
        Dog dog = new Dog("bublik","yourk", 2);
        dog.sayDog();
        int sum = add(1,2,4);
        System.out.println(sum);
        System.out.println(add(4,6,8,3,2,5,7,8));
    }

    public static int add(int first, int second, int third){
        return first + second + third;
    }

    public static int add(int @NotNull ... number){
        int sum = 0;
        for(int numbers: number){
            sum+=numbers;
        }
        return  sum;
    }
}
