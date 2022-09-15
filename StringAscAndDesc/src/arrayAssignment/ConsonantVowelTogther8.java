package arrayAssignment;

public class ConsonantVowelTogther8 {

	public static void main(String[] args) {

		String str = "abcdefghijklmnopqrstuvwxyz";
		char[] a = str.toCharArray();

		for (int i = 0; i < a.length; i++) {

			if (a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u') {

				continue;
			}

			System.out.print(a[i] + ",");

		}

		System.out.print("---");

		for (int i = 0; i < a.length; i++) {

			if (a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u') {

				System.out.print(a[i] + ",");

			}
		}
		
	}
}
