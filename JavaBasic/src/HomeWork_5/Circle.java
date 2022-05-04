package HomeWork_5;

public class Circle extends Shape {

    public Circle() {

    }

    public Circle(String color){
        super(color);
    }

    @Override
    public void draw() {
        super.draw();
        System.out.println("Draw circle");
    }

}

