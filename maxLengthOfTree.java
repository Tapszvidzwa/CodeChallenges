// Snippet of code to calculate the maximum length of a tree



/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	static int height(Node root) {
      	// Write your code here.
        int x = 0;
        int y = 0;
     
        
        if(root == null) {
            return 0;
        } else 
        if(root.left == null && root.right == null) {
            return 0;
        }
        else {
            x = 1 + height(root.left);
            y = 1 + height(root.right);
        }
        
        if(x > y) {
            return x;
        } else {
          return y; 
    }
        
    }
