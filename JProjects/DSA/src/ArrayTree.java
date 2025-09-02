public class ArrayTree {
    int tree[];

    // Constructor to initialize the tree array with max size
    public ArrayTree(int size) {
        tree = new int[size];
        for(int i = 0;i < size; i++){
            tree[i] = -1; // Initialize all elements to -1
        }
    }

    void SetRoot(int key){
        tree[0] = key;
    }

    void SetLeft(int parent,int key){
        int leftIndex = 2*parent + 1;
        tree[leftIndex] = key;
    }

    void SetRight(int parent,int key){
        int rightIndex = 2*parent + 2;
        tree[rightIndex] = key;
    }

    void PrintTree(){
        for(int i = 0;i < tree.length; i++){
            if(tree[i] != -1){
                System.out.print(tree[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayTree t = new ArrayTree(10);

        t.SetRoot(1);
        t.SetLeft(0, 2);
        t.SetRight(0, 3);
        t.SetLeft(1, 4);
        t.SetRight(1, 5);

        t.PrintTree();
    }
}
