@FunctionalInterface

interface Greet {
    void SayHello(String name);
}

interface Operation{
    int Calculate(int a,int b);
}

public class InterfacePractice {
    public static void main(String[] args) {
        Greet g = (name) -> System.out.println("Hello " + name);
        g.SayHello("Rahul");

        Operation add = (a,b) -> a + b;
        Operation sub = (a,b) -> a - b;
        Operation mul = (a,b) -> a * b;

        System.out.println(add.Calculate(5, 3));
        System.out.println(sub.Calculate(5, 3));
        System.out.println(mul.Calculate(5, 3));
    }
}
