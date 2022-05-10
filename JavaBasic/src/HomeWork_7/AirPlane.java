package HomeWork_7;

public class AirPlane {

    public static void  printAirplaneInfo(String type,String model,int ekonom,int business){
        System.out.println("Тип самолета: " + type + ", модель: "+ model + ", кол. пасажиров эконом класса: " + ekonom + ", пассажиров бизне скласса: " + business);

    }

    public static void  printAirplaneInfo(String type,String model,int ekonom){
        System.out.println("Тип самолета: " + type + ", модель: "+ model + ", кол. пасажиров эконом класса: " + ekonom);

    }


    public static void  printAirplaneInfo(String type,String model){
        System.out.println("Тип самолета: " + type + ", модель: "+ model);

    }

    public static void main(String[] args) {
        printAirplaneInfo("Jet","F-22 Raptor");
        printAirplaneInfo("Airliner"," Aerobus 737",120);
        printAirplaneInfo("Airliner","Boeing 777", 180,28);
    }
}