public class ArrayStack {
    private int[] a;
    private int top = -1;

    ArrayStack(int cap) {
        a = new int[cap];
    }

    public void Push(int x){
        if(top == a.length - 1){
            throw new StackOverflowError();
        }
        else{
            a[++top] = x;
        }
    }

    public int Pop(){
        if(top == -1){
            throw new IllegalStateException("Stack is empty");
        }
        else{
            return a[top--];
        }
    }

    public int Peek(){
        if(top == -1){
            throw new IllegalStateException("Stack is empty");
        }
        else{
            return a[top];
        }
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);
        stack.Push(10);
        stack.Push(20);
        stack.Push(30);
        System.out.println(stack.Peek()); // Output: 30
        System.out.println(stack.Pop());  // Output: 30
        System.out.println(stack.Pop());  // Output: 20
        System.out.println(stack.Peek()); // Output: 10
        System.err.println(stack.Pop());  // Output: 10
         System.out.println(stack.Pop());  // Throws IllegalStateException
    }
}
