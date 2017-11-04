/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/

void preOrder(Node root) {
    
    
    
    //pre order traversal
    
    //root then left then right
    
    //check if node is null then return
    
    //perfom a while left is not null. if null
    //then print the rootvalue
    
    //perfom a while the node right is not null. if null
    //then print the root right value
    
    
    if(root == null) {
        return;
    } else {
        System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
    
}
}

