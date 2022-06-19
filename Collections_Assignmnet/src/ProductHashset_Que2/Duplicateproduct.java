package ProductHashset_Que2;

import java.util.HashSet;

public class Duplicateproduct {
	public static void main(String[] args) {
		HashSet<String> hashset =  new HashSet<String>();
		hashset.add("Apple");
		hashset.add("pineapple");
		hashset.add("Grapes");
		hashset.add("Mango");
		hashset.add("ladoo");
		hashset.add("Grapes");
		hashset.add("Apple");
		hashset.add("Orange");
		hashset.add("ladoo");
		hashset.add(null);
	    System.out.println(hashset);

	}
}
