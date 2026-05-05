package AssignmentDay11;

import java.util.*;

class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "programming";

        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for (char ch : str.toCharArray()) {
            set.add(ch);
        }

        StringBuilder result = new StringBuilder();
        for (char ch : set) {
            result.append(ch);
        }

        System.out.println("After removing duplicates: " + result);
    }
}