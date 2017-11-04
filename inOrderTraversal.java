/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/

void inOrder(Node root) {
    
    //traversals in treees are recursive so you should take note of that
    
    //first in order is left root then right
    
    //base case first
    //if we reach a null root then return 
    
    //otherwise
    
    //assume the recursion fairy will print the left side
    //print the data that you currently have
    //assume the recursion fairy will print the right side
    
    
    if(root == null) {
        return;
    }
    
    else {
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    
    
    
    
    
    
    

}
