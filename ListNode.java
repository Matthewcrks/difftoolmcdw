public class ListNode {
    public Object data;
    public ListNode next;

    public ListNode(Object newItem) {
        data = newItem;
        next = null;
    } // constructor

    public ListNode(Object newItem, ListNode nextNode) {
        data = newItem;
        next = nextNode;
    } // overloaded constructor
} // Node
