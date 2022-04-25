package JustCodingForEnjoy;

public class Inkaps {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.displayInnerContext();
        Lessons_15 lessons_15 = new Lessons_15();
        lessons_15.myMethod();
        lessons_15.displayMesagge(new Message() {
            @Override
            public String sayHello() {
                return "Привет";
            }
        });
    }
}
