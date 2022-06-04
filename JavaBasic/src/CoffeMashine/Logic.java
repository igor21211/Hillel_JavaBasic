package CoffeMashine;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.SplittableRandom;

public class Logic extends CoffieMashine implements Coffie {

    /**
     * The function getMenu() displays the list of drinks and their prices
     */
    public static void getMenu(){
        for (CoffeList coffeList: CoffeList.values()){
            System.out.println("Number " + coffeList.number +" " + coffeList + " price: " + coffeList.price + "$");
        }
        System.out.println("Choose a drink from the list, Set number: ");
    }


    /**
     * If the user inputs an integer, return it, otherwise return 0.
     *
     * @return The input from the user.
     */
    public static int inputMethod() {
        try {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            return 0;
        }
    }

    /**
     * This function is used to add the price of the drink to the wallet and add the name of the drink to the order
     *
     * @param number the number of the drink that the user has chosen
     * @param wallet the amount of money the user has
     * @param order ArrayList of Strings
     * @return The wallet
     */
    public static int getChek(int number, int wallet, ArrayList order ){
        switch (number){
            case 1:
                wallet+=getAMERICANO_PRICE();
                order.add("Americano: 25$");
                breewAmericano();
                break;
            case 2:
                wallet+= getKAPUCHINO_PRICE();
                order.add("Kapuchino: 30$");
               breewKapuchino();
                break;
            case 3:
                wallet+= getTEA_PRICE();
                order.add("Tea: 15$");
                breewTea();
                break;
            default:
                System.out.println("Incorrect input");
        }
        return wallet;
    }


public static void logic(int chek, ArrayList order){
    while(true) {
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("yes")) {
            getMenu();
            int number = inputMethod();
            int price = getChek(number, chek, order);
            chek += price;
            System.out.println("Your order: " + order.toString());
            System.out.println("Your chek is: " + chek+"$");
            System.out.println("more coffee?yes/no");
        } else if (answer.equalsIgnoreCase("no")) {
            System.out.println("Your order: " + order.toString());
            System.out.println("Your chek is: " + chek +"$");
            System.out.println("Good Bye");
            break;
        }
    }
}


    public static void start(){
        ArrayList<String> order = new ArrayList<>();
        int chek = 0;
        System.out.println("Hello,do you want some coffee?yes/no");
       logic(chek,order);
    }


    @Override
    public void breewCoffee() {
        breewAmericano();
        breewKapuchino();
        breewTea();
    }

    public static void breewAmericano(){
        System.out.println("\n" +
                " ▄▄▄▄▄▄▄▄▄▄▄  ▄▄       ▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄        ▄  ▄▄▄▄▄▄▄▄▄▄▄ \n" +
                "▐░░░░░░░░░░░▌▐░░▌     ▐░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░▌      ▐░▌▐░░░░░░░░░░░▌\n" +
                "▐░█▀▀▀▀▀▀▀█░▌▐░▌░▌   ▐░▐░▌▐░█▀▀▀▀▀▀▀▀▀ ▐░█▀▀▀▀▀▀▀█░▌ ▀▀▀▀█░█▀▀▀▀ ▐░█▀▀▀▀▀▀▀▀▀ ▐░█▀▀▀▀▀▀▀█░▌▐░▌░▌     ▐░▌▐░█▀▀▀▀▀▀▀█░▌\n" +
                "▐░▌       ▐░▌▐░▌▐░▌ ▐░▌▐░▌▐░▌          ▐░▌       ▐░▌     ▐░▌     ▐░▌          ▐░▌       ▐░▌▐░▌▐░▌    ▐░▌▐░▌       ▐░▌\n" +
                "▐░█▄▄▄▄▄▄▄█░▌▐░▌ ▐░▐░▌ ▐░▌▐░█▄▄▄▄▄▄▄▄▄ ▐░█▄▄▄▄▄▄▄█░▌     ▐░▌     ▐░▌          ▐░█▄▄▄▄▄▄▄█░▌▐░▌ ▐░▌   ▐░▌▐░▌       ▐░▌\n" +
                "▐░░░░░░░░░░░▌▐░▌  ▐░▌  ▐░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌     ▐░▌     ▐░▌          ▐░░░░░░░░░░░▌▐░▌  ▐░▌  ▐░▌▐░▌       ▐░▌\n" +
                "▐░█▀▀▀▀▀▀▀█░▌▐░▌   ▀   ▐░▌▐░█▀▀▀▀▀▀▀▀▀ ▐░█▀▀▀▀█░█▀▀      ▐░▌     ▐░▌          ▐░█▀▀▀▀▀▀▀█░▌▐░▌   ▐░▌ ▐░▌▐░▌       ▐░▌\n" +
                "▐░▌       ▐░▌▐░▌       ▐░▌▐░▌          ▐░▌     ▐░▌       ▐░▌     ▐░▌          ▐░▌       ▐░▌▐░▌    ▐░▌▐░▌▐░▌       ▐░▌\n" +
                "▐░▌       ▐░▌▐░▌       ▐░▌▐░█▄▄▄▄▄▄▄▄▄ ▐░▌      ▐░▌  ▄▄▄▄█░█▄▄▄▄ ▐░█▄▄▄▄▄▄▄▄▄ ▐░▌       ▐░▌▐░▌     ▐░▐░▌▐░█▄▄▄▄▄▄▄█░▌\n" +
                "▐░▌       ▐░▌▐░▌       ▐░▌▐░░░░░░░░░░░▌▐░▌       ▐░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░▌       ▐░▌▐░▌      ▐░░▌▐░░░░░░░░░░░▌\n" +
                " ▀         ▀  ▀         ▀  ▀▀▀▀▀▀▀▀▀▀▀  ▀         ▀  ▀▀▀▀▀▀▀▀▀▀▀  ▀▀▀▀▀▀▀▀▀▀▀  ▀         ▀  ▀        ▀▀  ▀▀▀▀▀▀▀▀▀▀▀ \n" +
                "                                                                                                                     \n");;
        System.out.println("DONE!");
    }
    public static void breewKapuchino(){
        System.out.println("\n" +
                " ▄    ▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄         ▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄         ▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄        ▄  ▄▄▄▄▄▄▄▄▄▄▄ \n" +
                "▐░▌  ▐░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░▌       ▐░▌▐░░░░░░░░░░░▌▐░▌       ▐░▌▐░░░░░░░░░░░▌▐░░▌      ▐░▌▐░░░░░░░░░░░▌\n" +
                "▐░▌ ▐░▌ ▐░█▀▀▀▀▀▀▀█░▌▐░█▀▀▀▀▀▀▀█░▌▐░▌       ▐░▌▐░█▀▀▀▀▀▀▀▀▀ ▐░▌       ▐░▌ ▀▀▀▀█░█▀▀▀▀ ▐░▌░▌     ▐░▌▐░█▀▀▀▀▀▀▀█░▌\n" +
                "▐░▌▐░▌  ▐░▌       ▐░▌▐░▌       ▐░▌▐░▌       ▐░▌▐░▌          ▐░▌       ▐░▌     ▐░▌     ▐░▌▐░▌    ▐░▌▐░▌       ▐░▌\n" +
                "▐░▌░▌   ▐░█▄▄▄▄▄▄▄█░▌▐░█▄▄▄▄▄▄▄█░▌▐░▌       ▐░▌▐░▌          ▐░█▄▄▄▄▄▄▄█░▌     ▐░▌     ▐░▌ ▐░▌   ▐░▌▐░▌       ▐░▌\n" +
                "▐░░▌    ▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░▌       ▐░▌▐░▌          ▐░░░░░░░░░░░▌     ▐░▌     ▐░▌  ▐░▌  ▐░▌▐░▌       ▐░▌\n" +
                "▐░▌░▌   ▐░█▀▀▀▀▀▀▀█░▌▐░█▀▀▀▀▀▀▀▀▀ ▐░▌       ▐░▌▐░▌          ▐░█▀▀▀▀▀▀▀█░▌     ▐░▌     ▐░▌   ▐░▌ ▐░▌▐░▌       ▐░▌\n" +
                "▐░▌▐░▌  ▐░▌       ▐░▌▐░▌          ▐░▌       ▐░▌▐░▌          ▐░▌       ▐░▌     ▐░▌     ▐░▌    ▐░▌▐░▌▐░▌       ▐░▌\n" +
                "▐░▌ ▐░▌ ▐░▌       ▐░▌▐░▌          ▐░█▄▄▄▄▄▄▄█░▌▐░█▄▄▄▄▄▄▄▄▄ ▐░▌       ▐░▌ ▄▄▄▄█░█▄▄▄▄ ▐░▌     ▐░▐░▌▐░█▄▄▄▄▄▄▄█░▌\n" +
                "▐░▌  ▐░▌▐░▌       ▐░▌▐░▌          ▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░▌       ▐░▌▐░░░░░░░░░░░▌▐░▌      ▐░░▌▐░░░░░░░░░░░▌\n" +
                " ▀    ▀  ▀         ▀  ▀            ▀▀▀▀▀▀▀▀▀▀▀  ▀▀▀▀▀▀▀▀▀▀▀  ▀         ▀  ▀▀▀▀▀▀▀▀▀▀▀  ▀        ▀▀  ▀▀▀▀▀▀▀▀▀▀▀ \n" +
                "                                                                                                                \n");
        System.out.println("DONE!");
    }

    public static void breewTea(){
        System.out.println("\n" +
                " ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄  ▄▄▄▄▄▄▄▄▄▄▄ \n" +
                "▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌\n" +
                " ▀▀▀▀█░█▀▀▀▀ ▐░█▀▀▀▀▀▀▀▀▀ ▐░█▀▀▀▀▀▀▀█░▌\n" +
                "     ▐░▌     ▐░▌          ▐░▌       ▐░▌\n" +
                "     ▐░▌     ▐░█▄▄▄▄▄▄▄▄▄ ▐░█▄▄▄▄▄▄▄█░▌\n" +
                "     ▐░▌     ▐░░░░░░░░░░░▌▐░░░░░░░░░░░▌\n" +
                "     ▐░▌     ▐░█▀▀▀▀▀▀▀▀▀ ▐░█▀▀▀▀▀▀▀█░▌\n" +
                "     ▐░▌     ▐░▌          ▐░▌       ▐░▌\n" +
                "     ▐░▌     ▐░█▄▄▄▄▄▄▄▄▄ ▐░▌       ▐░▌\n" +
                "     ▐░▌     ▐░░░░░░░░░░░▌▐░▌       ▐░▌\n" +
                "      ▀       ▀▀▀▀▀▀▀▀▀▀▀  ▀         ▀ \n" +
                "                                       \n");
        System.out.println("DONE!");
    }
}
