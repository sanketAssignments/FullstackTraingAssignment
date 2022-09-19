package exceptionAssignment;

import java.util.Scanner;

public class TestMarks {

	public static void main(String[] args) throws Exception{
		Scanner s=new Scanner(System.in);
		
		Student1 stu=new Student1(101, "sachin", "xyz", new StudentResult1(45,34,65,55));
		
		 if(stu.getSrobj().getEnglish()<35 && stu.getSrobj().getBiology()<35 || stu.getSrobj().getHindi()<35 && stu.getSrobj().getMath()<35 || 
		 stu.getSrobj().getHindi()<35 && stu.getSrobj().getBiology()<35 || stu.getSrobj().getEnglish()<35 && stu.getSrobj().getMath()<35){
	        {
	            throw new ResultException("you failed in 2 subjects...");    
	            
	        }
		
		}
}}