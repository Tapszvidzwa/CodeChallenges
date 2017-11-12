/*You are given a pointer to the root of a binary tree. You need to print the level order traversal of this tree. In level order traversal, we visit the nodes level by level from left to right. You only have to complete the function. For example:

     1
      \
       2
        \
         5
        /  \
       3    6
        \
         4  
For the above tree, the level order traversal is 1 -> 2 -> 5 -> 3 -> 6 -> 4.

Input Format

You are given a function,

void levelOrder(node * root) {

}
Constraints

1 Nodes in the tree  500

Output Format

Print the values in a single line separated by a space.

Sample Input

     1
      \
       2
        \
         5
        /  \
       3    6
        \
         4  
Sample Output

1 2 5 3 6 4

Explanation

We need to print the nodes level by level. We process each level from left to right. 
Level Order Traversal: 1 -> 2 -> 5 -> 3 -> 6 -> 4.
*/


//The trick here is to think about how the tree is going to be printed
// it first prints the root, then goes on to print the children
// starting from left to right... that order has to be maintained
//
// The only data structure that allows you to do the printing such that the
// first elements to be entered are the ones which are printed first is the queu
//
// so add the top root first and print that, now add the left side of the 
// the tree to the queue and add the right side
// 
// now remove the elemetns and print them
static Queue<Node> queue = new LinkedList<Node>();

static void levelOrder(Node root){
    if( root != null ){
        queue.add(root);
    }
    while( !queue.isEmpty() ){
        Node tree = queue.remove();
        System.out.print(tree.data + " ");

        if( tree.left != null ){
            queue.add( tree.left );
        }
        if( tree.right != null ){
            queue.add( tree.right );
        }
    }
}
