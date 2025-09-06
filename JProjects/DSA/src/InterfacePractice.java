@FunctionalInterface

interface Greet {
    void SayHello(String name);
}

public class InterfacePractice {
    public static void main(String[] args) {
        Greet g = (name) -> System.out.println("Hello " + name);
        g.SayHello("Rahul");
    }
}
