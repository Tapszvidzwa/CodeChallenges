import java.io.*;


public class MySelectionSort{

	//functions outside of the main have to be tagges as static functions


	public static void main(String[] args) {


		int[] arr1 = {3,2,1,5,4};
			printArray(arr1);

		for(int i = 0; i < arr1.length; i++) {
			
			//have a function that returns the smallest value
			//replace the arr[i] with that returned value
			
			int smallestIndex = findSmallestIndex(arr1, i);
			//have a function that switches the positions
			arr1 = switchPositions(arr1, i, smallestIndex);
			printArray(arr1);

		}

 		printArray(arr1);

	}

	public static int[] switchPositions(int[] arr, int start, int smallest) {

		int holder = arr[start];

		arr[start] = arr[smallest];
		arr[smallest] = holder;

		return arr;
	}

	public static int findSmallestIndex(int[] arr, int start) {

		int smallestIndex = start;

		for(int i = start; i < arr.length; i++) {

		if(arr[i] < arr[smallestIndex]) {

		smallestIndex = i;
		}
	}

       return smallestIndex;


	}
}
