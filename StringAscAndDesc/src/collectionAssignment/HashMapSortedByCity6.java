package collectionAssignment;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMapSortedByCity6 {

	public static void main(String[] args) {
		
		HashMap<String,Integer> hm=new HashMap<>();
		hm.put("pune",635365);
		hm.put("mumbai",63545);
		hm.put("indor",535343);
		hm.put("nagpur",623736);
		hm.put("hydrabad",534362);
		
		TreeMap<String,Integer> sort=new TreeMap<>();
		
		sort.putAll(hm);
		
		System.out.println(sort);
	}

}
