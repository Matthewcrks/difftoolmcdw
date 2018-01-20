import java.util.*;

public class SinglyLinkedList
{
	public ListNode first, last;

	public SinglyLinkedList()
	{
		first = null;
		last = null;
	}

	public Object getFirst()
	{
		if (first == null)
		{
			throw new NoSuchElementException();
		}
		else
		{
			return first.data;
		}
	}
	
	public Object getLast() {
		if (last == null) {
			throw new NoSuchElementException();
		}
		else {
			return last.data;
		}
	}

	public void addFirst(Object value) 
	{
        if (first == null) {
			first = new ListNode(value, null);
			last = first;
		}
        else first = new ListNode(value, first);
	}
	
	public void addLast(Object value) {
		if (first == null) {
			first = new ListNode(value, null);
			last = first;
		}
		else {
			ListNode temp = new ListNode(value, null);
            last.next = temp;
			last = temp;
		} 
	} // addLast

	public void printList()
	{
		ListNode temp = first; // start at the first node
		while (temp != null) 
		{
			System.out.print(((Word)(temp.data)).word + " ");
			temp = temp.next; // go to next node
		}
	}
	
	public int size() {
		int counter = 0;
		ListNode temp = first;
		
		while (temp != null) {
			counter++;
			temp = temp.next;
		}
		return counter;
	}
} 