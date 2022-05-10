package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Lessons {
    public static void main(String[] args) {
        Queue<Integer> myQueue = new LinkedList<>();

        myQueue.add(1);
        myQueue.add(2);
        myQueue.add(3);
        myQueue.offer(22);//работает как и адд добавляет обьект в масив но имеет на 1 експешион меньше

        System.out.println(myQueue.peek());//при пустой очереди ничего не выдаст
        System.out.println(myQueue.element());// при пустой очереди выдаст ексепшен

        System.out.println("Before deleting");


        for(int i : myQueue){
            System.out.println(i);
        }

        //myQueue.poll();// удаляет первый елемент масива с если выходит за рамки масива , не выдает ексепшен.
        myQueue.remove(3);// удаляет по названию обьекта если выходит за рамки ошибка



        System.out.println("After deleting");

        for(int i : myQueue){
            System.out.println(i);
        }

    }
}
