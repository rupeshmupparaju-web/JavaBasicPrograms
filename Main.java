
public class Main {
	public static void main(String[] args) {
		Tree myfavoriteOakTree = new Tree(25, 5, TreeType.OAK); //This creates a new instance of the Tree class with a height of 25, age of 5, and type OAK
		myfavoriteOakTree.grow(); //This calls the grow method of the Tree class to	
		myfavoriteOakTree.announceTreeType();//This calls the announceTreeType method of the Tree class to print the type of the tree
	}
}
