public class ThreadPractice {
    public static void main(String[] args) {
        Shared obj = new Shared();

        Thread t1 = new Thread(() -> obj.produce());
        Thread t2 = new Thread(() -> obj.consume());
        t1.start();
        t2.start();
    }
}

class UsingRunnable implements Runnable{
    public void run(){
        System.out.println("Thread is running using Runnable interface");
    }
}

class Shared {
    synchronized void produce() {
        System.out.println("Producing...");
        try { wait(); } catch (Exception e) {}
        System.out.println("Resumed after wait");
    }

    synchronized void consume() {
        System.out.println("Consuming...");
        notify(); // wakes up producer
    }

    void increment() {
        
        synchronized(this) {
            // critical section
            //count++;
        }
    }
    
}