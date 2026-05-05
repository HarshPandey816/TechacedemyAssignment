package AssignmentDay11;

import java.util.*;

class SortMapByKeys {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(3, "C");
        map.put(1, "A");
        map.put(2, "B");

        TreeMap<Integer, String> sortedMap = new TreeMap<>(map);

        System.out.println("Sorted Map: " + sortedMap);
    }
}