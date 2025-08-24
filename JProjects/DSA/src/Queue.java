public class Queue {
    int size;
    int front, rear;
    int arr[];

    Queue(int cap){
        size = cap;
        arr = new int[size];
        front = 0;
        rear = -1;
    }

    void Enqueue(int x){
        if(rear == size -1){
            throw new IllegalStateException("Queue is full");
        }
        else{
            arr[++rear] = x;
            System.out.println(x + " enqueued to queue");
        }
    }

    void Dequeue(){
        if(front > rear){
            throw new IllegalStateException("Queue is empty");
        }
        else{
            System.out.println(arr[front] + " dequeued from queue");
            front++;
        }
    }

    // Display elements
    void display() {
        if (front > rear) {
            System.out.println("Queue is Empty");
        } else {
            System.out.print("Queue: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.Enqueue(10);
        q.Enqueue(20);
        q.Enqueue(30);
        q.display();

        q.Dequeue();
        q.display();
    }
}
