package JustCodingForEnjoy;

public class Lessons_15 {
    void myMethod(){

        int num = 888;

        class MethodInnerDemo{
            public void print(){
                System.out.println("Этот метод внутреннего класса " + num);
            }
        }


        MethodInnerDemo methodInnerDemo = new MethodInnerDemo();
        methodInnerDemo.print();
    }

    public void displayMesagge(Message m){
        System.out.println(m.sayHello() + " Это пример анонимного класса");
    }
}
