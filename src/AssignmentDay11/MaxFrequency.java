package AssignmentDay11;

import java.util.*;

class MaxFrequency {
    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 1, 4, 1, 3, 3, 3};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxElement = -1, maxCount = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxElement = entry.getKey();
            }
        }

        System.out.println("Element with max frequency: " + maxElement);
        System.out.println("Frequency: " + maxCount);
    }
}