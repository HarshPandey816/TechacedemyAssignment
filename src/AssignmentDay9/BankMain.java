package AssignmentDay9;

class BankAccount {
    private int balance = 1000;

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() +
                " Deposited: " + amount + " Balance: " + balance);
    }

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() +
                    " Withdrew: " + amount + " Balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() +
                    " Insufficient Balance");
        }
    }
}

class BankMain {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        Thread t1 = new Thread(() -> account.deposit(500), "User1");
        Thread t2 = new Thread(() -> account.withdraw(700), "User2");
        Thread t3 = new Thread(() -> account.withdraw(1000), "User3");

        t1.start();
        t2.start();
        t3.start();
    }
}