package JustCodingForEnjoy;

public class Outer {

    static void displayInnerContext() {
        Inner inner = new Inner();
        inner.sayHello();
    }

    private static class Inner {
        public void sayHello() {
            System.out.println("Hello");
        }

    }
}
