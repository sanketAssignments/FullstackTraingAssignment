package exceptionAssignment;

public class Student1 {

	int rollno;
	String sname;
	String saddress;
	StudentResult1 srobj;
	
	public Student1(int rollno, String sname, String saddress, StudentResult1 srobj) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.saddress = saddress;
		this.srobj = srobj;
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

	public String getSaddress() {
		return saddress;
	}

	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}

	public StudentResult1 getSrobj() {
		return srobj;
	}

	public void setSrobj(StudentResult1 srobj) {
		this.srobj = srobj;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + ", saddress=" + saddress + ", srobj=" + srobj + "]";
	}
	
}
