package exceptionAssignment;

import java.util.Scanner;

public class CustomerAssembledSystem {

	public static void main(String[] args) {
		String processor,ssd,hdd;
		int ram;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your requirement to buy Assembled System");
		System.out.println("Enter processor in (ex.I3) format");
		processor=scan.next();
		System.out.println("Enter ram GB format(ex.4)");
		ram=scan.nextInt();
		if("I3".equalsIgnoreCase(processor) | "I5".equalsIgnoreCase(processor)
				| "I7".equalsIgnoreCase(processor)) {
		if(4<=ram) {
			try {
			throw new LowerRAMSizeException();}
			catch(LowerRAMSizeException e) {
				e.printStackTrace();
			}
		}
			
		}
		System.out.println("Enter ssd");
		ssd=scan.next();
		System.out.println("Enter hdd");
		hdd=scan.next();
		
		
		
	}
}
