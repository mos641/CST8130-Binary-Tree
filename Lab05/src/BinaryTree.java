/**
 * * 
 * This class contains the Binary Tree definition 
 * Student Name: Mostapha A
 * Course: CST8130 - Data Structures CET-CS-Level 3
 * 
 * @author/Mostapha A
 * 
 */

/**
 * creates the binary tree.
 */
public class BinaryTree {
	/** The root or beginning of the tree */
	BinaryTreeNode root = null;

	/**
	 * Inserts data in a tree as a node
	 * 
	 * @param newData The data to be inserted
	 */
	public void insertInTree(int newData) {
		// if the tree is empty, set root as the new data
		if (root == null) {
			root = new BinaryTreeNode(newData);
		} else {
			// otherwise call insert method to sort the data accordingly
			root.insert(newData);
		}
	}

	/**
	 * Public method to display the tree in pre-order traversal
	 */
	public void displayPreOrder() {
		// call the private method and print a new line
		displayPreOrder(root);
		System.out.println();
	}

	/**
	 * Traverse the tree recursively using PreOrder algorithm and display the
	 * content to the console
	 * 
	 * @param subRoot The node being acted upon
	 */
	private void displayPreOrder(BinaryTreeNode subRoot) {
		// if the node is null return
		if (subRoot == null) {
			return;
		}
		// print the nodes data, recursively call this method for each branch
		System.out.printf("%s ", subRoot.getData());
		displayPreOrder(subRoot.getLeft());
		displayPreOrder(subRoot.getRight());
	}

	/**
	 * Recursive method to calculate and return the height of the tree.
	 * 
	 * @return The height of the tree
	 * @param node The node to check the height of, starts with root
	 */
	public int returnHeight(BinaryTreeNode node) {
		// integers to count height for right and left side
		int right = 0;
		int left = 0;

		// if node is null there is no more height, return 0
		if (node == null)
			return 0;
		else {
			// recursively call this method with the left and right node
			left = returnHeight(node.getLeft());
			right = returnHeight(node.getRight());

			// check which side is larger, increment and return it
			if (right > left) {
				return (right + 1);
			} else {
				return (left + 1);
			}
		}
	}
}
