package Lessons_14;

public class Bicycle {

    String model;
    int weight;
    public static String abc;

    public static void abs(){
        System.out.println("sout");
    }


    class SteeringWheel{

        public static void  left(){
            System.out.println("left");
        }
       public static  void right(){
            System.out.println("right");
        }
    }




    static class Seat{
        void up(){
            System.out.println("up");
        }

        void down(){
            System.out.println("down");
        }
    }


}
