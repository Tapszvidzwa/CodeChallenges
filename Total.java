import java.util.*;

public class Total {

	public static int sum(int[] arr) {

		int total = 0;
		for (int element : arr) {
			total += element;
		}

		return total;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// scan number of elements in the array
		int b = s.nextInt();

		int[] arr = new int[b];

		// scan the individual elements in the array
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
			}
	
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	//	System.out.println(sum(arr));
		s.close();
	}
}
