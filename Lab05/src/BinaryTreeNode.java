/**
 * * 
 * This class contains the Binary Tree Node definition 
 * Student Name: Mostapha A
 * Course: CST8130 - Data Structures CET-CS-Level 3
 * 
 * @author/Mostapha A
 * 
 */


/**
 * creates a single Node of the binary tree.
 */
public class BinaryTreeNode {
	/** The data of the node */
	private int data;
	/** The next node in the tree of the left branch */
	private BinaryTreeNode left;
	/** The next node in the tree of the right branch */
	private BinaryTreeNode right;

	/**
	 * Default constructor for a tree node
	 */
	public BinaryTreeNode() {
		// set left and right to null by default
		left = null;
		right = null;
	}

	/**
	 * Constructor that takes in data and sets it
	 * 
	 * @param data The data to use for the node
	 */
	public BinaryTreeNode(int data) {
		// set left and right to null and set data
		left = null;
		right = null;
		this.data = data;
	}

	/**
	 * Getter method for the data of the node
	 * 
	 * @return The data of the node
	 */
	public int getData() {
		return data;
	}

	/**
	 * Getter method for the node of the left branch
	 * 
	 * @return The left branch node
	 */
	public BinaryTreeNode getLeft() {
		return left;
	}

	/**
	 * Getter method for the node of the right branch
	 * 
	 * @return The right branch node
	 */
	public BinaryTreeNode getRight() {
		return right;
	}

	/**
	 * Inserts new data as the left or right branch node in a binary tree
	 * 
	 * @param newData The data to use for a new node
	 */
	public void insert(int newData) {
		// check if the new data is less than the root, to add to left or right
		if (newData < data) {
			// if smaller number check if left is null and add
			if (left == null) {
				left = new BinaryTreeNode(newData);
			} else {
				// otherwise add to later in the left branch, recursively call this method
				left.insert(newData);
			}
			
		} else if (newData > data) {
			// if greater number check if right is null and add
			if (right == null) {
				right = new BinaryTreeNode(newData);
			} else {
				// otherwise add to later in the right branch, recursively call this method
				right.insert(newData);
			}
		} else {
			// if the new data is equal to the node/root being acted upon, print error
			System.out.println("The integer " + newData + " is a duplicate, has not been added.");
		}
	}
}
