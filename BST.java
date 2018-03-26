import java.io.*;
import java.util.*;


public class BST {
	
	public BST() {
	}

	
	public static Node root;

	public static void insert(int value,Node root) {

		System.out.println(root.data);

		if(root == null) {
			System.out.println("Iam in node");
			root = new Node(value);
			return;
		}

		if(value < root.data) {
			System.out.println("I am in node.left");
			insert(value, root.left);
		} else if(value > root.data) {
			System.out.println("I am in node.right");
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

		BST tree = new BST();

		int[] arr = {2,3,5,6,7,9};

		for(int i = 0; i < arr.length; i++) {
			tree.insert(arr[i], root);
			}

		inOrderTraversal(root);

	}

}



