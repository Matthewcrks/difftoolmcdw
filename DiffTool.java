import java.util.*;

public class DiffTool {
	public SinglyLinkedList wordList;
	public ArrayList<String> sentence,paragraph;

	public DiffTool() {
		wordList = new SinglyLinkedList();
		paragraph = new ArrayList<String>();
		sentence = new ArrayList<String>();
	}

	public static void main(String[] args) {
		DiffTool df = new DiffTool();
		df.run();
	} 

	public void run() {
		String testString = "the quick brown fox\n titties";
		String testString2 = "fox and quick brown";
		
		parseParagraph(testString);

		//parseString(testString);

		int stringCode = 0;
		ListNode temp = wordList.first;

		while (temp != null) {
			System.out.println("hash code for " + ((Word)(temp.data)).word + " is " + ((Word)(temp.data)).word.hashCode());
			stringCode += ((Word)(temp.data)).word.hashCode();

			temp = temp.next;
		}

		// looking at second text file now
		//parseSentence(testString2);
		// file added to linked list now

		for (String t: paragraph) {
			System.out.println(t);
		}
	}	

	public void parseString(String s) {
		String[] arr = s.split("\\s+");

		String word;
		for (int x = 0; x < arr.length; x++) {
			word = arr[x];


			wordList.addLast(new Word (word, x));
		}

		wordList.printList();
	}

	public void parseSentence(String s) {
		String[] splitString = s.split("\\.");

		for(String p: splitString) {
			paragraph.add(p);
		}
	}

	public void parseParagraph(String s)
	{
		System.out.println(s);
		String [] splitString = s.split("[\\r\\n]+");
		System.out.println("length of splitstring is " + splitString.length);
		for(String p: splitString)
		{
			System.out.println(p);
		}

		//for(String )
	}

	public int generateHashCode(String s) {
		return s.hashCode();
	}
}
