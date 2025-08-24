class Node{
    int data;
     Node left, right;

     Node(int val){
        data = val;
        left = right = null;
     }
}

public class BinaryTree {
    Node root;

    BinaryTree(){
        root = null;
    }

    public static void main(String[] args) {
        
        BinaryTree tree = new BinaryTree();

        //building the tree
        tree.root = new Node(0);
        tree.root.left = new Node(1);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(4);

        System.out.println("Tree created using linked representation!");
    }
}
