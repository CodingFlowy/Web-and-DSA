import java.util.*;
public class JavaCollections {
    public static void main(String[] args) {
        
        /*///ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("ArrayList: " + list);

        ListIterator<String> iterator = list.listIterator();
        System.out.println("forward traversal:");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("backward traversal:");
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }*/

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(40);
        pq.add(10);
        pq.add(30);
        pq.offer(20);
        
        System.out.println(pq);
        System.out.println("Head: " + pq.peek()); // 10
        System.out.println("Removed: " + pq.poll()); // 10
        System.out.println("After poll: " + pq); // [30, 40]

       /*  TreeSet<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(2);
        set.add(9);

        System.out.println(set);
        System.out.println(set.first());*/
    }
}
