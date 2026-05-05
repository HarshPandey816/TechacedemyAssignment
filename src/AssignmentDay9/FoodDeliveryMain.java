package AssignmentDay9;

import java.util.concurrent.*;

class FoodOrder implements Runnable {
    private String orderName;

    FoodOrder(String orderName) {
        this.orderName = orderName;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() +
                " Processing order: " + orderName);
        try {
            Thread.sleep(2000);
        } catch (Exception e) {}
        System.out.println(Thread.currentThread().getName() +
                " Delivered: " + orderName);
    }
}

class FoodDeliveryMain {
    public static void main(String[] args) {

        ExecutorService pool = Executors.newFixedThreadPool(3);

        pool.execute(new FoodOrder("Pizza"));
        pool.execute(new FoodOrder("Burger"));
        pool.execute(new FoodOrder("Pasta"));
        pool.execute(new FoodOrder("Biryani"));
        pool.execute(new FoodOrder("Sandwich"));

        pool.shutdown();
    }
}