package arrayAssignment;

public class CountDuplicateNumber2 {

	public static void main(String[] args) {
		int count=1,temp=0;
		int arr[]= {24,45,67,4,5,67,9,8,4};
		for(int i=0;i<=arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					temp=arr[j];
					count++;
					System.out.println(temp+" "+count);
				}
				
			}
			count=1;
		}
		
	}
}
