/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/

void postOrder(Node root) {
    
    //this is a recursive function
    // therefore it should have base case first
    // and then secondly the recursive case
    
    //1] the base case
    //if root is null then return
    
   //post order the left
   //post order the right 
   // then print the data
    
    
    if(root == null){
        return;
    } else {
        
        //assume the recursion fairy will print everything on the left
        //then print everything on the right and then all you have to do is to
        //print the root data
       postOrder(root.left);
       postOrder(root.right);
       System.out.print(root.data + " "); 
    }
    
    //if you reach null return
    //else 
    
    
    
    
    

}
