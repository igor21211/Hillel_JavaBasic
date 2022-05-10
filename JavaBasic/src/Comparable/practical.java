package Comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class practical {

    public static void main(String[] args) {
        String[] mass = {"aaa", "bb", "cc"};

        List<String> ourlist = Arrays.asList(mass);
        System.out.println(ourlist);

        ourlist.set(1, "ddd");
        System.out.println(Arrays.toString(mass));

        List<String> myList = Arrays.asList("Красный", "Синий", "Зеленый", "Черный", "Белый");
        Collections.sort(myList);//сортировка
        Collections.sort(myList, Collections.reverseOrder());//сортировка в обратном порядке
        Collections.reverse(myList);//Перевернет лист
        Collections.shuffle(myList);//Рандом порядок
        System.out.println( Collections.frequency(myList,"Синий"));
        System.out.println(myList);

        List<Integer> mylists = Arrays.asList(1,2,5,4,98,35);
        System.out.println(Collections.max(mylists));
        System.out.println(Collections.min(mylists));



    }
}
