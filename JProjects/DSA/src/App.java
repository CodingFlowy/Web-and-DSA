import java.util.Scanner;

class Node{
    int data;
    Node link;

    Node(int data){
        this.data = data;
        this.link = null;
    }
}

public class App {
    

    static Node Insert(Node p,int n){
        Node temp;
        if(p == null){
            p = new Node(n);
            p.link = p;
        }
        else{
            temp = p;
            while(temp.link != p){
                temp = temp.link;
            }
            Node newNode = new Node(n);
            temp.link = newNode;
            newNode.link = p;
        }
        return p;   
    }

    static void PrintList(Node p){
        if(p == null){
            System.out.println("List is empty");
            return;
        }

        Node temp = p;
        System.out.print("List: ");
        do{
            System.out.println(temp.data + "\t");
            temp =temp.link;
        }
        while(temp != p);
        System.out.println();

    }
    public static void main(String[] args){
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        Node start = null;

        System.out.println("Enter the number of nodes to be inserted:");
        int n = sc.nextInt();

        while(n-- >0){
            System.out.println("Enter the data value for the node:");
            int x = sc.nextInt();
            start = Insert(start,x);
        }
        System.out.println("The circular linked list is:");
        PrintList(start);
        sc.close();
    }
}
