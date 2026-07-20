package TreePrograms;
public class Main {
	public static void main(String[] args) {
		Tree myfavoriteOakTree = new Tree(25, 5, TreeType.OAK); //This creates a new instance of the Tree class with a height of 25, age of 5, and type OAK
		myfavoriteOakTree.grow(); //This calls the grow method of the Tree class to	
		myfavoriteOakTree.announceTreeType();//This calls the announceTreeType method of the Tree class to print the type of the tree
		myfavoriteOakTree.announceTallTree();//This calls the announceTallTree method of the Tree class to print if the tree is tall
		myfavoriteOakTree.announceTreeColor();//This calls the announceTreeColor method of the Tree class to print the color of the tree

	}
}
