import java.util.*;

public class DiffTool {
	public SinglyLinkedList ll;
	public ArrayList<String> secondText;

	public DiffTool() {
		ll = new SinglyLinkedList();
		secondText = new ArrayList<String>();
	}

	public static void main(String[] args) {
		DiffTool df = new DiffTool();
		df.run();
	} 

	public void run() {
		String testString = "the quick brown fox";
		String testString2 = "fox and quick brown";
		
		parseString(testString);

		int stringCode = 0;
		ListNode temp = ll.first;

		while (temp != null) {
			System.out.println("hash code for " + ((Word)(temp.data)).word + " is " + ((Word)(temp.data)).word.hashCode());
			stringCode += ((Word)(temp.data)).word.hashCode();

			temp = temp.next;
		}

		// looking at second text file now
		parseSecondFile(testString2);
		// file added to linked list now

		for (String t: secondText) {
			System.out.println(t);
		}
	}	

	public void parseString(String s) {
		String[] arr = s.split("\\s+");

		String word;
		for (int x = 0; x < arr.length; x++) {
			word = arr[x];


			ll.addLast(new Word (word, x));
		}

		ll.printList();
	}

	public void parseSecondFile(String s) {
		// String[] splitString = s.split("[\\p{Punct}]+");
		String[] splitString = s.split("\\.");

		for(String p: splitString) {
			secondText.add(p);
		}
	}

	public int generateHashCode(String s) {
		return s.hashCode();
	}
}