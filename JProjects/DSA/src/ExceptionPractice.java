public class ExceptionPractice {
    public static void main(String[] args) {
        try {
            int a = 5 / 0; // unchecked exception
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        try {
            Thread.sleep(1000); // checked exception
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}
