package binarytreecustom;

public class BinaryTreeCustom {

    public static void main(String[] args) {
        Tree myTree = new Tree();
        myTree.insert("L");
        myTree.insert("F");
        myTree.insert("D");
        myTree.insert("A");
        myTree.insert("E");
        myTree.insert("J");
        myTree.insert("I");
        myTree.insert("K");
        myTree.insert("R");
        myTree.insert("O");
        myTree.insert("M");
        myTree.insert("Q");
        myTree.insert("V");
        myTree.insert("S");
        myTree.insert("Z");
        
        // Display the content of the tree using preOrder
        myTree.preOrder(myTree.getRoot());
        System.out.println();
        
        // Print paths of Binary Tree
        myTree.displayPaths(myTree.getRoot(), "");
    }
    
}
