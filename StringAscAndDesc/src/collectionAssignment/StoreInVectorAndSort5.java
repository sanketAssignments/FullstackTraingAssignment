package collectionAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class StoreInVectorAndSort5 {

	public static void main(String args[])
    {
    	ArrayList<Integer> al=new ArrayList<>();
		al.add(4);
		al.add(4);
		al.add(54);
		al.add(34);
		al.add(33);
		al.add(76);
		al.add(54);
	
		Vector<Integer> v=new Vector<>();
		v.addAll(al);
		
		Collections.sort(al);
		System.out.println(al);
		
}
	
}
