package Pair_Que4;

import java.util.Date;
import java.util.HashMap;

public class PairB {

	public static void main(String[] args) {
		//creating an object
		HashMap<String,Date> hashmap = new HashMap<String,Date>();
		//adding key-value pair
		hashmap.put("today is", new java.util.Date());
		System.out.println(hashmap);
	}

}
