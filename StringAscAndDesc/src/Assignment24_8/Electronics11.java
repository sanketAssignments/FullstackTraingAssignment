package Assignment24_8;

public class Electronics11 {   
	    
	    public static void main(String[] args) {
	        Electronic11 e1=new Electronic11(1, "silicon", "11022022");
	        Electronic11 e2=new Mobile(2, "silicon1", "14022022");
	        Electronic11 e3=new LCD(3, "silicon2", "15022022");
	        Electronic11 e4=new Laptop(4, "silicon3", "17022022");
	        
	        System.out.println("Electronic="+e1);
	        System.out.println("Mobile="+e2);
	        System.out.println("LCD="+e3);
	        System.out.println("Laptop="+e4);
	    }
	    
}
