package exceptionAssignment;

public class StudentResult1 {

	int english;
	int biology;
	int math;
	int hindi;

	public StudentResult1(int english, int biology, int math, int hindi) {
		super();
		this.english = english;
		this.biology = biology;
		this.math = math;
		this.hindi = hindi;
	}

	public int getEnglish() {
		return english;
	}

	public void setEnglish(int english) {
		this.english = english;
	}

	public int getBiology() {
		return biology;
	}

	public void setBiology(int biology) {
		this.biology = biology;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getHindi() {
		return hindi;
	}

	public void setHindi(int hindi) {
		this.hindi = hindi;
	}

	@Override
	public String toString() {
		return "StudentResult [english=" + english + ", biology=" + biology + ", math=" + math + ", hindi=" + hindi
				+ "]";
	}

 public void result() throws ResultException
     {
         int total= (math+biology+hindi+english)*100;
         int avg=total/300;
         System.out.println(avg);    
         
         if(math<0 || biology<0 || hindi<0 || english<0)
         {
             throw new ResultException("Marks cant be Negative");
         }
         
         else if(avg<40 )
         {
             throw new ResultException("your result is fail");
         
         }
         else {System.out.println("Passsssss bete");}
         
     }
	
}


class ResultException extends Exception {
	public ResultException(String errMsg) {
	super(errMsg);
	}
}
	
