package AssignmentDay9;

class EvenOdd {
    private int number = 1;
    private final int MAX = 100;

    public synchronized void printOdd() {
        while (number <= MAX) {
            if (number % 2 == 0) {
                try { wait(); } catch (Exception e) {}
            } else {
                System.out.print(number + " ");
                number++;
                notify();
            }
        }
    }

    public synchronized void printEven() {
        while (number <= MAX) {
            if (number % 2 != 0) {
                try { wait(); } catch (Exception e) {}
            } else {
                System.out.print(number + " ");
                number++;
                notify();
            }
        }
    }
}

class EvenOddMain {
    public static void main(String[] args) {

        EvenOdd obj = new EvenOdd();

        Thread t1 = new Thread(() -> obj.printOdd());
        Thread t2 = new Thread(() -> obj.printEven());

        t1.start();
        t2.start();
    }
}