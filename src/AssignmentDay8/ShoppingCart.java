package AssignmentDay8;

import java.util.*;

class ShoppingCart {
    public static void main(String[] args) {

        // Product → Price mapping
        HashMap<String, Integer> productPrice = new HashMap<>();
        productPrice.put("Laptop", 50000);
        productPrice.put("Phone", 20000);
        productPrice.put("Headphones", 2000);

        // Cart (List)
        List<String> cart = new ArrayList<>();
        cart.add("Laptop");
        cart.add("Phone");
        cart.add("Headphones");

        int total = 0;

        for (String item : cart) {
            total += productPrice.get(item);
        }

        System.out.println("Cart Items: " + cart);
        System.out.println("Total Price: " + total);
    }
}