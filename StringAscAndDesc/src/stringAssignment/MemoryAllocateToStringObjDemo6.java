package stringAssignment;

public class MemoryAllocateToStringObjDemo6 {

		    public static void main(String[] args) {
		        
		        String s1=new String("akshay"); 
		        
		        String s2=new String("akshay"); 
		        
		        String s3="akshay"; 
		        
		        String s4="akshay"; 
		        
		        System.out.println("s1: "+s1.hashCode());
		        System.out.println("s2: "+s2.hashCode());
		        System.out.println("s3: "+s3.hashCode());
		        System.out.println("s4: "+s4.hashCode());
		        
		        System.out.println(s1.equals(s3)); // contains are same
		        System.out.println("In Heap memory: "+s1==s3);
		        
		    
	}
}
