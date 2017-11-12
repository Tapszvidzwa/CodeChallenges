/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.util.*;

class Solution {
    
   // In order traversals are very easy, all you need to make
   // sure is that the recursion fairy will take care of everything
   //
   // imagine that the recursion fairy has done the traversal of
   // adding in the left tree and the traversal of adding in the right 
   // tree
   //
   // all you need to do is the final step which is just adding the 
   // root to the linked list 
   //
   // another thing to take note of is that the return valeu for the 
   // inOrder traversal needs to be a list itself	
   List<Integer> inorderList = new ArrayList<>();
   
    public List<Integer> inorderTraversal(TreeNode root) {
      
        
        if(root == null) {
            return inorderList;
        } else {
            
            inorderTraversal(root.left);
            inorderList.add(root.val);
            inorderTraversal(root.right);
            
        }
        
        return inorderList;
        
     }
}
