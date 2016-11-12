/*Program to rotate elements of an array and print out array elements */

/*THIS IS THE SOLUTION FROM HACKERANK */


/* input
   3 2 3       [N = 3, K = 2, Q = 3]
   1 2 3       [the array elements]
   0           [Indexes to be fetched elements from]
   1
   2

*/


public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int N=in.nextInt(); //size of array
    int K=in.nextInt(); //number of array rotations
    int Q=in.nextInt(); //number of queries to be asked for array elements at some index point

    int rot=K%N; //because if u rotate the array by N times it comes back to original
                 //rot basically tells you which element will be at the indexed position when the rotations occur
                 //its like when you rotate the elements its like they are being pushed back in the array
                 
    
    int[] arr=new int[N];

    for(int i=0;i<N;i++)
        arr[i]=in.nextInt();

   for(int i=0;i<Q;i++)
       {
           int idx=in.nextInt();             //                                              rot idx
           if(idx-rot>=0) //i.e if the push back is still within the array size               |   |                 rot
	                                         //print where the element would be    [*,*,*,*,*,*]                 |
	                                         //if rot idx - rot becomes neg its as if u have two arrays [*,*,*,*,*] [*,*,*,*,*]
	                                         //hence we add n for it to correspond to the current array
	       System.out.println(arr[idx-rot]); 
           else
	       System.out.println(arr[idx-rot+arr.length]); //
}
   //the best way to think about these rotations is to think of imaginary arrays in out line as shown above
