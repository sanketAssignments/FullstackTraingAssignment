package streamApi;

import java.util.Scanner;

public class StringPattern6 {

	public static void main(String[] args) {
		
	char ch[]= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter character for Pattern");
	char s=scan.nextLine().charAt(0);
	//for(int k=0;k<=)
	for(int i=0;i<ch.length;i++) {
		if(ch[i]==s) {
			for(int j=i;0<=j;j--) {
				System.out.print(ch[j]);
			}
			break;
		}
		System.out.print(ch[i]);
	}
	
//	
//	for(int i=s.length()-1;i>=s.length()/2;i--) {
//	System.out.print(s.charAt(i));
//	
//	}
	
}
}