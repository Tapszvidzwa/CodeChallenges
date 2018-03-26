
public class BST {

	public class Node{ 
	int data;
	Node left, right;

	public Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}


	public static Node root = null;
	
	public static void insert(int value, Node root) {

		if(root == null) {
			root = new Node(value);
		}

		if(value < root.data) {
			insert(value, root.left);
		} else if(value > root.data) {
			insert(value, root.right);
		}
	}

	public static void inOrderTraversal(Node focusNode) {
		if(focusNode == null) {
			System.out.print("");
			return;
		}

		inOrderTraversal(focusNode.left);
		System.out.print(focusNode.data + " ");
		inOrderTraversal(focusNode.right);

	}

	public static void main(String[] args) {	
		int[] arr = {2,3,5,6,7,9};

		for(int i = 0; i < arr.length; i++) {
			insert(arr[i], root);
		}

		inOrderTraversal(root);

	}

}



