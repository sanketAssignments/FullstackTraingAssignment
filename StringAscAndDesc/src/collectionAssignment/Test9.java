package collectionAssignment;

import java.util.HashSet;
import java.util.Set;

public class Test9 {

	 public static void main(String[] args) {

         Employee9 e1 = new Employee9(201, "akshay", 1000, "sr.Enginner", "kolhapur");
           Employee9 e2 = new Employee9(202, "sumit", 2000, "software", "amravti");
           Employee9 e3 = new Employee9(203, "tushar", 2300, "IT", "mumbai");
           Employee9 e4 = new Employee9(204, "akash", 5000, "Admin", "pune");
           Employee9 e5 = new Employee9(205, "raju", 4000, "It", "pune");
          
           
         Set<Employee9> list = new HashSet<>();
           list.add(e1);
           list.add(e2);
           list.add(e3);
           list.add(e4);
           list.add(e5);

         for (Employee9 e : list) {
               System.out.println(e);
           }
	
}
}