package collectionAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentList7 {
	
	void getTopThree(List l) {
		
		Collections.sort(l);
		System.out.println(l.subList(0,3));
	}
	
	void getAboveFifty(List l) {
		
	}
	

	public static void main(String[] args) {
		
		List<StudentSortByMarks7> l=new ArrayList<>();
		l.add(new StudentSortByMarks7(101, "shubham", "10th", 300));
		l.add(new StudentSortByMarks7(102, "lavish", "10th", 400));
		l.add(new StudentSortByMarks7(103, "akshay", "10th", 350));
		l.add(new StudentSortByMarks7(104, "rohit", "10th", 200));
		l.add(new StudentSortByMarks7(105, "tushar", "10th", 250));
		l.add(new StudentSortByMarks7(106, "pavan", "10th", 170));
			
			StudentList7 sl=new StudentList7();
			sl.getTopThree(l);
			
		for(StudentSortByMarks7 s:l) {
			
			if(s.getTotalmarks()*100/500>250*100/500) {
				System.out.println(s);
			}
			
			if(s.getTotalmarks()*100/500<35) {
				System.out.println("----Name below 35%----");
				System.out.println(s.getSname());
			}
		}
		
		Collections.sort(l,new StudentSortedByName());
		System.out.println(l);
	}

}
