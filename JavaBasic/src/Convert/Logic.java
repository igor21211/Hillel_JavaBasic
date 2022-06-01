package Convert;

import java.util.Scanner;

public class Logic implements Converter {


    @Override
    public void covert() {
        getKelvin(getNumber());
        getFarengein(getNumber());
    }

    private static double getFarengein(int celsium) {
        return (9 / 5.0 * celsium + 32);
    }

    private static double getKelvin(int celsium) {
        return celsium + 273.15;
    }

    public static int getNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number in Celsius");
        return scanner.nextInt();
    }

    public static void getTemp(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Want to convect Celsius breasts?Y/N");

        if(scanner.nextLine().equalsIgnoreCase("Y")){
            int number = getNumber();
            System.out.println("What unit of measure do you want to convert to?K = Kelvin/F=Feringate");
            String answer = scanner.nextLine();
            if(answer.equalsIgnoreCase("K")){
                System.out.println(number + " Celsium in Kelvin its: " + getKelvin(number));
                getTemp();
            }else if(answer.equalsIgnoreCase("F")){
                System.out.println(number + " Celsium in Feringate its: " + getFarengein(number));
                getTemp();
            }else{
                System.out.println("Incorrect input");
            }

        }else{
            System.out.println("Have a good day!");
        }

    }
}
