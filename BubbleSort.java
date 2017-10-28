import java.io.*;





public class BubbleSort{



	public static void main(String[] args) {



			int[] arr = {1,4,5,3,2};




			//create two pointers
			//one that points to an element and another that points to an element in front of it
			//now create a boolean that is initially false
			//this boolean is only true when we make a full pass of the array without swapping elements
			//
			//
			// the outer loop should be a while loop
			//  the inner loop should be a for loop 
			//
			//  so while the boolean is still not false false 
			//
			//
			//run a for loop with int i = 0 then i + i, maximum is i < i - 1;; 
			//if the two the previous element is smaller than the next element then swap them, else increment
			//
			//
			//

			boolean sorted = false;


			while(!sorted) {

				sorted = true; 

				for(int i = 0; i < arr.length - 1; i++) {
				
			
				if(arr[i] > arr[i + 1]) {

					int holder = arr[i];

					arr[i] = arr[i + 1];
					arr[i + 1] = holder;

					sorted = false;
				}
			}

		}

		printArray(arr);

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
