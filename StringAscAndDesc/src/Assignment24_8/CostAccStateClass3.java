package Assignment24_8;

import java.util.Date;

public class CostAccStateClass3 {

	
	public static void main(String[] args) {
		
		Customer3 customer1=new Customer3(101, "353356445", "akshay", "xyz", new Date(2/4/22), new Date(2/4/21), new Branch3(3434, "axis", "pune"));
		System.out.println(customer1);
		Customer3 customer2=new Customer3(102, "353356445", "akshay", "xyz", new Date(2/4/22), new Date(2/4/21), new Branch3(3434, "axis", "pune"));
		System.out.println(customer2);
		Customer3 customer3=new Customer3(103, "353356445", "akshay", "xyz", new Date(2/4/22), new Date(2/4/21), new Branch3(3434, "axis", "pune"));
		System.out.println(customer3);
		
	}
}
