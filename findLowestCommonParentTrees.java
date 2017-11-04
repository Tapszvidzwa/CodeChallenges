/*You are given pointer to the root of the binary search tree and two values v1 and v2 . You need to return the lowest common ancestor (LCA) of v1  and v2  in the binary search tree.

image

In the above example, the lowest common ancestor of the nodes  and  is the node , as  is the lowest common node which has both the nodes  and  as it's descendants.

You only need to complete the function.

Input Format

You are given a function,

node * lca (node * root ,int v1,int v2) {

}
It is guaranteed that v1 and v2 are present in the tree.

Node is defined as :

struct node
{
int data;
node * left;
node * right;
}node;
Output Format

Return the LCA of  and .

Sample Input

         4
       /   \
      2     7
     / \   /
    1   3 6
 v1 = 1 and v2 = 7 .

Sample Output

LCA of v1 and v2  is 4  (which is the root). 
Return a pointer to the root in this case.

*/


// I failed this question but the basic logic from one answer i found 
// on hackerrank is this
//
//
//We know that for a binary search tree, the all the elements in the left
//subtree are smaller than the root and all the elements in the right subtree
//are larger than the root. 
//
//Therefore, in order to find the lowest common ancestor, just use this rule
//to check whether the the values v1 and v2 are both smaller than the root.
//
// if they are smaller, it therefore means there is another smaller subtree
// therefore search in the left subtree
//
// if they are both higher, it means there is a smaller right subtree so ther
// fore search in the right subtree
//
// if its not one of the cases above, then it means one is smaller and the 
// other is larger which ultimately means this is the lowest common ancestor
// that you need.
//
// here is the solution from hackerrank 
//

static Node lca(Node root,int v1,int v2)
{
    Node temp = root;     
    while (true) {
	    //if both are smaller than root, search left sub tree
        if (temp.data > v1 && temp.data > v2) {
            temp = temp.left;

	    //else if both are larger, search the left sub tree
        } else if (temp.data < v1 && temp.data < v2) {
            temp = temp.right;

	    //otherwise you have reached the value you need
        } else {
            return temp;
        }
    }
}
//
//
//
//

