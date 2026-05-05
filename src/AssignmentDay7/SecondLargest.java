package AssignmentDay7;

import java.util.*;

class SecondLargest {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 20, 5, 8, 20, 15);

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : list) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        System.out.println("Second Largest: " + secondLargest);
    }
}