package arrayAssignment;

public class SortLengthWise10 {

	public static void main(String[] args) {
		
		String array[]= {"apple","mom","radar","banana"};
		
		for(int i=0;i<array.length;i++) {
			
			for(int j=i+1;j<array.length;j++) {
			if(array[i].length()>array[j].length()) {
				String temp=array[i];
				array[i]=array[j];
				array[j]=temp;
			}
			}
		}
		for(String s:array) {
			System.out.println(s);
		}
	}
}
