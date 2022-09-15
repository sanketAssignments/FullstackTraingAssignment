package Assignment24_8;

public class UsingFinalize {

	public static void main(String[] args) {
		
		Product9 p=new Product9();
		p=null;
		System.gc();
		System.out.println("End of garbadge collection");

	}
 
	@Override
	protected void finalize() {
		System.out.println("inside finalize");
	}
}
