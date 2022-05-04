package JustCodingForEnjoy;

import java.util.HashMap;
import java.util.Map;

public class Hash_Map {
    public static void main(String[] args) {
        HashMap<String, Integer> myMap = new HashMap<String, Integer>();
        myMap.put("Igor",30);
        myMap.put("Sasha",28);
        myMap.put("Anatoliy",40);
        myMap.put("Sergey",18);
        //map with foreach
        for (Map.Entry<String,Integer> map: myMap.entrySet()){
            System.out.println(map.getKey() + " " + map.getValue());
        }


        System.out.println(myMap.get("Igor"));

        myMap.remove("Sasha");

        for (Map.Entry<String,Integer> map: myMap.entrySet()){
            System.out.println(map.getKey() + " " + map.getValue());
        }

        System.out.println("Example with valid key " + myMap.containsKey("Igor"));
        System.out.println("Example with valid value " + myMap.containsValue(30));

        System.out.println(myMap.size());

    }
}
