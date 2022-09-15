package Assignment24_8;

public class CloneMethod9 {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Product9 pro1=new Product9(101, "parle", 2000, "Killo Gram");
		
		Product9 pro2=(Product9) pro1.clone();
		pro2.setPname("Godrege");
		pro2.setPrice(34353);
		
		
		System.out.println(pro2);
		if(pro2 instanceof Product9) {
			
			System.out.println("Objects are same");
		}
		
	}
}
