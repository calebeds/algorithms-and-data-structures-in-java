package datastructures.hashtable.java;

import java.util.HashMap;
import java.util.Map;

public class HashMapInJava {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        // INSERT into the map O(1) IF THERE IS NO COLLISION
        map.put(1, "Adam");
        map.put(2, "Kevin");
        map.put(3, "Ana");
        map.put(40, "Lucy");
//        map.put(null, "This is a null");

        // we can retrieve items based on keys O(1)
//        System.out.println(map.get(null));

//        for(Integer key: map.keySet()) {
//            System.out.println(map.get(key));
//        }

        for(Map.Entry<Integer, String> entry: map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
