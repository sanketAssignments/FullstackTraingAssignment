package streamApi;

interface Check4{

	void print();
}

public class CreatePattern_5 {

		public static void main(String[] args) {
			
			int arr[]= {1,2,3,4,6,7,8,11,13,14,15,19,20,21,21,22};
			Check4 c= ()->{
			int j=0;
			for(int i=0;i<arr.length;i=++j) {
				int count=1;
			System.out.print(arr[i]);
			while(j<arr.length-1) {
				
				if(arr[j+1]-arr[j]==1) {
					j++;
					count++;
					continue;
				}
				else {
					if(count==1) {
						System.out.print(", ");
						break;
					}
					System.out.print("-"+arr[j]+", ");
					break;
				}
				
			}
			}		
			System.out.print("-"+arr[--j]);
		};
		c.print();
		}
	}

