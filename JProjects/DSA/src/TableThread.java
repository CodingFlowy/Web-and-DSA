class TablePrinter {
    public synchronized void printTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        System.out.println();
    }
}

public class TableThread {
    public static void main(String[] args) {
        TablePrinter printer = new TablePrinter();

        Thread t1 = new Thread(() -> {
            printer.printTable(5);
        });

        Thread t2 = new Thread(() -> {
            printer.printTable(10);
        });

        Thread t3 = new Thread(() -> {
            printer.printTable(15);
        });

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
