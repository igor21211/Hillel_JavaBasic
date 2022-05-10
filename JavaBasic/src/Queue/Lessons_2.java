package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Lessons_2 {
    public static void main(String[] args) {
        Queue<String> myQueue = new LinkedList<>();

        myQueue.add("бананы");
        myQueue.add("яблуко");
        myQueue.add("ананас");

        while(!myQueue.isEmpty()){
            System.out.println(myQueue.poll());
        }


    }
}
