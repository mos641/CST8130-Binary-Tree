import java.util.Scanner;

/**
 * * 
 * This class contains the main method and menu for testing 
 * Student Name: Mostapha A
 * Course: CST8130 - Data Structures CET-CS-Level 3
 * 
 * @author/Mostapha A
 * 
 */


/**
 * Tests the BinaryTree and Node class.
 */
public class BinaryTreeTest {

	/**
	 * Main method for printing menu and processing.
	 * 
	 * @param args Default needed for main method
	 */
	public static void main(String[] args) {
		// var for menu input
		int menu = -1;
		Scanner scanner = new Scanner(System.in);
		// object
		BinaryTree tree = new BinaryTree();
		// data input
		int data = -1;
		boolean success;

		// loop through menu
		do {
			// set menu to -1
			menu = -1;

			// print menu
			showMenu();

			// if input is an int, store
			if (scanner.hasNextInt()) {
				menu = scanner.nextInt();
			} else {
				// clear input
				scanner.next();
			}

			// if it is out of range print error and loop again
			if (menu < 1 || menu > 4) {
				// print error and loop through again
				System.out.println("Invalid input entered. Try again.");
			} else {
				// case structure for menu options
				switch (menu) {
				case 1:
					// add value to tree, ask for input
					do {
						success = false;
						System.out.print("Enter an integer to add to the tree: ");

						// if input is an int, store
						if (scanner.hasNextInt()) {
							data = scanner.nextInt();
							success = true;
						} else {
							// clear input print error
							scanner.next();
							System.out.println("Not a valid integer value. Try again.");
							success = false;
						}
					} while (success == false);
					
					// insert validated data
					tree.insertInTree(data);
					break;
				case 2:
					// display tree
					tree.displayPreOrder();
					break;
				case 3:
					// display height
					System.out.println("Tree Height\n" + tree.returnHeight(tree.root));
					break;
				case 4:
					// exit
					System.out.println("Exiting...");
					break;
				}
			}

		} while (menu != 4);

		scanner.close();
	}

	/**
	 * Prints the menu of options for the program.
	 */
	public static void showMenu() {
		System.out.print("1: Add Value to Tree\n" + "2: Display Tree (Pre-order Traversal)\n" + "3: Display Height\n"
				+ "4: To Exit\n" + "> ");
	}

}
