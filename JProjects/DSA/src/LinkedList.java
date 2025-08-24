public class LinkedList {
    ListNode head;

    public void InsertAtBegining(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
    }

    public void InsertAtEnd(int val){
        ListNode newNode = new ListNode(val);
        if(head == null){
            head = newNode;
            return;
        }
        ListNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public void DeleteFirst(){
        if(head!=null){
            head = head.next;
        }
    }

    public void DeleteLast(){
        if(head == null||head.next == null){
            head = null;
            return;
        }
        ListNode curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
    }

    static void print(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        this.val = x;
    }
}
