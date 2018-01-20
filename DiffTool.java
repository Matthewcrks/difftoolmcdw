public class DiffTool {
	public SinglyLinkedList ll;

	public DiffTool() {
		ll = new SinglyLinkedList();
	}

	public static void main(String[] args) {
		DiffTool df = new DiffTool();
		df.run();
	} 

	public void run() {
		String testString = "the quick brown fox";
		parseString(testString);
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
}