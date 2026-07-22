package TreePrograms;

import java.awt.Color; //This imports the Color class from the java.awt package, which is used to represent colors in the RGB color model.

public class Tree {
    // Attributes of the Tree class
    int trunkdia; 
    int height;
    TreeType treeType; //  This declares a variable of type TreeType, which is an enum defined in the TreeType.java file. The treeType variable will hold the type of the tree (e.g., OAK, MAPLE, PECAN, WALNUT, PINE).
    Color treeColor = Color.green;   // Constructor for the Tree class
    Tree(int trunkdia, int height, TreeType treeType) {
        this.trunkdia = trunkdia;
        this.height = height;
        this.treeType = treeType;
    }
    // Method to make the tree grow
    void grow() {
        this.trunkdia = trunkdia + 5;
        this.height = height + 5;
    }
    // Method to announce the type of the tree
    void announceTreeType() {
        System.out.println("This is a " + treeType + " tree.");
    }
    // Method to announce if the tree is tall or not
    void announceTallTree() {
        if (this.height > 100) {
            System.out.println("This is a tall" + treeType + " tree.");
        } 
    }
    void announceTreeColor() {
        System.out.println("The color of the tree is " + treeColor + ".");
    }


}
