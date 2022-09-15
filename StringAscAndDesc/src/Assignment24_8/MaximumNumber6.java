package Assignment24_8;

import java.util.Arrays;

public class MaximumNumber6 {

		void maximum(int a[]) {
			
			int temp = 0;

		       for (int i = 0; i < a.length; i++) {
		            for (int j = 0; j < a.length; j++) {
		                if (a[i] > a[j]) {
		                    temp = a[i];
		                    a[i] = a[j];
		                    a[j] = temp;
		               }
		           }
		       }
		       
		       System.out.println("Third maximum number is: "+a[2]);
		   }
			
		}
		
	class NewMaximum extends MaximumNumber6{
		
		@Override
        void maximum(int a[]) {
			int temp = 0;

		       for (int i = 0; i < a.length; i++) {
		            for (int j = 0; j < a.length; j++) {
		                if (a[i] > a[j]) {
		                    temp = a[i];
		                    a[i] = a[j];
		                    a[j] = temp;
		               }
		           }
		       }
		       System.out.println(Arrays.toString(a));
		       
		       System.out.println("fourth maximum number is: "+a[3]);
		   }
			
        
		void max(int a[]) {
			int temp = 0;

		       for (int i = 0; i < a.length; i++) {
		            for (int j = 0; j < a.length; j++) {
		                if (a[i] > a[j]) {
		                    temp = a[i];
		                    a[i] = a[j];
		                    a[j] = temp;
		               }
		           }
		       }
		       System.out.println(Arrays.toString(a));
		       
		       System.out.println("maximum number is: "+a[0]);
		   }
			
				}
				

class Test2{
	public static void main(String[] args) {
		
		int arr[]= {3,4,5,6,67,7,6,5,43,2};
		
		MaximumNumber6 mn=new MaximumNumber6();
		mn.maximum(arr);
		
		NewMaximum nm=new NewMaximum();
		nm.max(arr);
		
	}
}
