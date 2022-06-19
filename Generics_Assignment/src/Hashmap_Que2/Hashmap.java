package Hashmap_Que2;

import java.util.HashMap;
import java.util.Map.Entry;

public class Hashmap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,Double> map= new HashMap<Integer,Double>();
		map.put(1,300.00);
		map.put(2,400.00);
		map.put(3,900.00);
		map.put(5, 400.33);
		map.put(3,666.00);

		for(Entry<Integer, Double> m : map.entrySet()){
		System.out.println("key: "+m.getKey()+"->"+"value: "+m.getValue());
		}


		}
}
