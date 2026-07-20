package TreePrograms;

import java.awt.Color;

public class Tree {
    // Attributes of the Tree class
    int trunkdia; 
    int height;
    TreeType treeType;
    static treeColor = new Color(34, 139, 34); // Static attribute for the color of the tree, initialized to a shade of green
    // Constructor for the Tree class
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
