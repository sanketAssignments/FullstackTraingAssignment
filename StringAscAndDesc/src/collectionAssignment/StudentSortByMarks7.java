package collectionAssignment;

import java.util.Comparator;

public class StudentSortByMarks7 implements Comparable<StudentSortByMarks7>{

	private int  rollno;
	private String sname;
	private String classname;
	private int totalmarks;
	
	public StudentSortByMarks7(int rollno, String sname, String classname, int totalmarks) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.classname = classname;
		this.totalmarks = totalmarks;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public int getTotalmarks() {
		return totalmarks;
	}

	public void setTotalmarks(int totalmarks) {
		this.totalmarks = totalmarks;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + ", classname=" + classname + ", totalmarks="
				+ totalmarks + "]";
	}

	@Override
	public int compareTo(StudentSortByMarks7 o) {
		return o.totalmarks-totalmarks;
	}
}

	class StudentSortedByName implements Comparator<StudentSortByMarks7>{

		@Override
		public int compare(StudentSortByMarks7 o1, StudentSortByMarks7 o2) {
			
			return o1.getSname().compareTo(o2.getSname());
		}

		
		
		
		
	}

	
	