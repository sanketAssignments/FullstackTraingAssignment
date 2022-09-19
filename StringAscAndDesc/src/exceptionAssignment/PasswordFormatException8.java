package exceptionAssignment;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordFormatException8 extends Exception {

	}
	class TestMain{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String regex = "^(?=.*[A-Z])(?=.*[a-z])"+"(?=.*[0-9])"+"(?=.*[@#$%^&]).{7,9}$";
		Pattern P=Pattern.compile(regex);
		System.out.println("Enter Password");
		String password=scan.next();
		if(password!=null) {
			
			Matcher m=P.matcher(password);
			if(!m.matches()) {
				try{
				throw new PasswordFormatException8();
				}
				catch(PasswordFormatException8 e) {
					System.out.println("please enter valid password");
				}
			}
		}
		
		
	}

}
