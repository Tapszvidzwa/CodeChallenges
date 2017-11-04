import java.io.*;

public class InsertionSort{




	public static void main(String[] args) {

		//arr REMEMBER arr IS SEPERATED BY COMMAS
		//For WHILE LOOPS BETTER IMPLEMENT IN THE FUNCTION AND CHECK WHETHER OR NOT IT IS LESS THAN 0 
		//ELSE YOU WILL GET AN ARRAY IS OUT OF BOUNDS EXCEPTION
		//
		//
		//if the array has just one element return that array
		//if not then move to the second element
		//if the previous element is bigger than the element, then switch them
		//if the previous element is smaller then stop
		//
		//YOUTUBE LINK: https://www.youtube.com/watch?time_continue=3&v=OGzPmgsI-pQ

		int arr[] = {4,3,2,1,5};


		if(arr.length == 1) {
		System.out.println(arr[0]);
		return;	
		}

		for(int i = 1; i < arr.length; i++) {

			int x = i;
				
			while((arr[x - 1] > arr[x]) && (x > 0)) {
			
				int holder = arr[x - 1];
				arr[x - 1] = arr[x];
				arr[x] = holder;
							
				--x;

				if(x == 0) {
					break;
				}
		
		}
	}


	 private static void printArray(int[] anArray) {
      for (int i = 0; i < anArray.length; i++) {
         if (i > 0) {
            System.out.print(", ");
         }
         System.out.print(anArray[i]);
      }
      System.out.println();
       System.out.println();

   }





}
