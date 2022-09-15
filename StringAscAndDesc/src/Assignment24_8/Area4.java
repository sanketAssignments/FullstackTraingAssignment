package Assignment24_8;

import java.util.Scanner;

public class Area4 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter no. of input");
		switch(scan.nextInt()) {
		case 2:System.out.println("Enter first input");
		        int i1=scan.nextInt();
		        System.out.println("Enter second input");
		        int i2=scan.nextInt();
		        if(i1==i2) {
		        	int area=i1*i2;
		        	System.out.println("Area of Square "+area);
		}
		        break;
		case 3:System.out.println("Enter first input");
		        int a=scan.nextInt();
		        System.out.println("Enter second input");
		        int b=scan.nextInt();
		        System.out.println("Enter second input");
		        int c=scan.nextInt();
		        
        	int area=(a*b)/2;
        	System.out.println("Area of Triangle "+area);
        	
        	 if(a>0 && b>0 && c>0){
                 int a1 = a*a;
                 int b1 = b*b;
                 int c1 = c*c;
                 if(c1== a1+b1 || b1==a1+c1 || a1==b1+c1){
                     System.out.println("Right-Angle Triangle");
                 }
                 else {
                     System.out.println("Not a right-angle Triangle");
                 }
             }
        	 break;
        	 default:System.out.println("Enter Valid Input");
        	 break;
}
		
		}
		
	}
