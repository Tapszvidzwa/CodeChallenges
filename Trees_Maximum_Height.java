/*The height of a binary tree is the number of edges between the tree's root and its furthest leaf. This means that a tree containing a single node has a height of .

Complete the getHeight function provided in your editor so that it returns the height of a binary tree. This function has a parameter, , which is a pointer to the root node of a binary tree. 
Note -The Height of binary tree with single node is taken as zero.

Input Format

You do not need to read any input from stdin. Our grader will pass the root node of a binary tree to your getHeight function.

Output Format

Your function should return a single integer denoting the height of the binary tree.

Sample Input

BST.png

Note: A binary search tree is a binary tree in which the value of each parent node's left child is less than the value the parent node, and the value of the parent node is less than the value of its right child.

Sample Output

3
Explanation

The longest root-to-leaf path is shown below:

Longest RTL.png

There are  nodes in this path that are connected by  edges, meaning our binary tree's . Thus, we print  as our answer.
*/




	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	static int height(Node root) {
      	// Write your code here. 
        
        //THis is basically a recursion thing,,,, imagine that 
        //
        //THIS IS THE BASE CASE. IF YOU GIVE ME A NULL ROOT OR IF I REACH 
        //A LEAF, RETURN 0
        if(root == null || (root.left == null && root.right == null)) {
            return 0;
        } else 
        {
            //OTHERWISE, USE THE RECURSION FAIRY. PRETEND THAT I HAVE
            //ALREDY FOUND THE MAXIMUM OF THE LEFT SIDE AND OF THE RIGHT 
            //SIDE, ALL I NEED TO DO IS ADD ONE TO IT
          return  1 + (Math.max(height(root.left), height(root.right)));
        }          
    }


