package Property_tax;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class logic extends Constructor  {


    private static final int tax = (int) 1.2;

    public logic(String nameProperty, int square) {
        super(nameProperty, square, tax);
    }



    /**
     * This function calculates the tax for a residential constructor
     *
     * @param constructor is the object that is being passed in.
     * @return The tax for the residential constructor.
     */
    private static double calcTaxResidential(Constructor constructor) {
        return calcTaxProduction(constructor) * 00.2 + (constructor.square * getTAX());

    }

    /**
     * If the constructor's revenue is greater than 100, return the constructor's square multiplied by the tax. Otherwise,
     * return 0
     *
     * @param constructor the object that is being passed in
     * @return The tax for the constructor.
     */
    private static double calcTaxTrading(Constructor constructor) {
        if (constructor.revenue > 100) {
            return constructor.square * getTAX();
        } else {
            return 0;
        }

    }

    /**
     * Calculate the tax for a production constructor.
     *
     * @param constructor the constructor object
     * @return The tax for the production of the constructor.
     */
    private static double calcTaxProduction(Constructor constructor) {
        return constructor.square * getTAX();
    }

    /**
     * Выводит приветствие и предлагает подсчитать налог.
     */
    public static void getInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Здраствуйте вас преведствует калькулятор налогов");
        System.out.println("Хотите подсчитать налог?да/нет");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("да")) {
            madeObject();
        } else {
            System.out.println("Всего хорошего!");
        }
    }

    /**
     * If the user inputs an integer, return it, otherwise return 0.
     *
     * @return The next integer that is inputted by the user.
     */
    public static int inputMethod() {
        try {
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            return 0;
        }
    }


    // Создает объект и вызывает методы для подсчета налога.
    private static void madeObject() {
        Constructor constructor = new Constructor();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите вид вашей недвижимости ,число Numbers которое соответствует категории вашей недвижимости");
        showProperty();
        int answer = inputMethod();
        if (answer == 1) {
            System.out.println("Какая общая площадь недвижимости?");
            int square = scanner.nextInt();
            constructor = (new Constructor("Жилая", square));
            System.out.println(constructor.toString()+ "\n" + "Ваш налог за месяц: " + calcTaxResidential(constructor) +"$");
        } else if (answer == 2) {
            System.out.println("Какая общая площадь недвижимости?");
            int square = scanner.nextInt();
            System.out.println("Укажите сумму выручки за последний месяц");
            int revenue = scanner.nextInt();
            constructor = (new Constructor("Торговая", square,revenue));
            System.out.println(constructor.toString() + " \n" + "Ваш налог за месяц: " + calcTaxTrading(constructor) +"$");
            if ( calcTaxTrading(constructor) <= 0 ){
                System.out.println("Ваша прибыль в этом месяце оч мала, поэтому с вас налог не изымается");
            }
        } else if (answer == 3) {
            System.out.println("Какая общая площадь недвижимости?");
            int square = scanner.nextInt();
            constructor = (new Constructor("Производственная", square));
            System.out.println(constructor.toString() + "\n" + "Ваш налог за месяц: " + calcTaxProduction(constructor) +"$");
        } else {
            System.out.println("Не корректный ввод/ Ожидается 1 , 2  или 3");
            madeObject();
        }

    }

    /**
     * For each view in the View enum, print out the number and the view.
     */
    public static void showProperty() {
        for (View view : View.values()) {
            System.out.println("Number: " + view.number + " " + view);
        }
    }

}
