class OnlineBank{
    int balance = 1000;

    synchronized void Withdraw(int amount){
        if(balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);
            balance -= amount;
        } else {
            System.out.println("Insufficient balance for " + Thread.currentThread().getName());
        }
    }
}

public class SynchronizationPractice {
    public static void main(String[] args) {
        OnlineBank account = new OnlineBank();

        Thread t1 = new Thread(() -> account.Withdraw(800),"User 1");
        Thread t2 = new Thread(() -> account.Withdraw(700),"User 2");

        t1.start();
        t2.start();
    }
}

