package HomeWork_8;

import HomeWork_8.Animal;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Eat extends Animal {

    public static void getInfo() {
        for (month mount : month.values()) {
            System.out.println(mount.month + " : " + mount);
        }
        System.out.println("********************************");
    }

    public static void getInfo(int a, String name) {
        if (a < 13) {
            for (month mount : month.values()) {
                if (a == mount.month) {
                    System.out.print("Report in " + mount + " mount for: " + name + " is ");

                }
            }
        } else {
            System.out.println("Incorrect mount! pls input correct number");
        }
    }


    public static int inputMethod() {
        try {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            return 0;
        }
    }

    public static int calculated(int a, int sum) {
        switch (a) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                sum *= 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                sum *= 30;
                break;
            case 2:
                sum *= 28;
                break;
            default:
                System.out.println("Incorrect input");
        }
        return sum;
    }


    public static String getChekChoose(int a) {
        String name = null;
        if (a == 1) {
            System.out.println("You'r choose Cats");
            name = "Cats";
        } else if (a == 2) {
            System.out.println("You'r choose Dogs");
            name = "Dogs";
        } else if (a == 3) {
            System.out.println("You want get info for Cats and Dogs");
            name = "Cats and Dogs";
        } else {
            System.out.println("You'r input is incorrect");
            System.out.println("**********************************");
            Eat eat = new Eat();
            eat.hello();
        }
        return name;
    }

    public int eatCalculated(int number, int date) {
        int result = 0;
        if (date <= 12) {
            if (number == 1) {
                result = calculated(date, eatsForCats(getCats(),getPart()));
            } else if (number == 2) {
                result = calculated(date, eatsForDogs(getDogs(), getPart()));
            } else if (number == 3) {
                result = calculated(date, eatForDogsAndCats(getCats(), getDogs(), getPart()));
            } else {
            }
        }
        return result;
    }


    public int mainCalculated(int number, int date) {
        int result = 0;
        if (date <= 12) {
            if (number == 1) {
                result = calculated(date, moneyForCats(getCats(), getMoney()));
            } else if (number == 2) {
                result = calculated(date, moneyForDogs(getDogs(), getMoney()));
            } else if (number == 3) {
                result = calculated(date, moneyForAll(getCats(), getDogs(), getMoney()));
            } else {
            }
        }
        return result;
    }


    public void hello() {


        System.out.println("Hello i'am calculated eat for animal! (-_-)");
        System.out.println("Ok so , now we need to decide for what animal we want get info? ");
        System.out.print("Please choose : Cats ore Dogs/ pls enter 1 for Cats : 2 for Dogs : 3 for Dags & Cats : ");
        int chooseAnimal = inputMethod();
        String name = getChekChoose(chooseAnimal);
        getInfo();
        System.out.println("Please input for what mount you want get info");
        System.out.print("Input Number of the mount: ");
        int date = inputMethod();
        if (date < 13) {
            getInfo(date, name);
            System.out.print(mainCalculated(chooseAnimal, date) + "$");
            System.out.print(" and mount feed for " + name + " is : " + eatCalculated(chooseAnimal, date) + " grams");
        } else {
            System.out.println("Incorrect input");
        }
    }
}
