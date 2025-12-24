package decisiontreenonrecursive;

public class DecisionTreeNonRecursive {

    public static void main(String[] args) {
        DecisionTree myDecisionTree = new DecisionTree();
        
        // Build the decision tree
        myDecisionTree.createRoot(1, "Does animal eat meat?");
        myDecisionTree.insertYesNode(1,2, "Does animal have stripes?");
        myDecisionTree.insertNoNode(1, 3, "Is animal an equine?");
        myDecisionTree.insertYesNode(2, 4, "Animal is a tiger!");
        myDecisionTree.insertNoNode(2, 5, "Animal is a leopard!");
        myDecisionTree.insertYesNode(3, 6, "Animal is a horse!");
        myDecisionTree.insertNoNode(3, 7, "Is animal a Bovine?");
        myDecisionTree.insertYesNode(7, 8, "Animal is a cow!");
        myDecisionTree.insertNoNode(7, 9, "No further questions.");
        
        // Display content of the decision tree
        //myDecisionTree.displayPreOrder(myDecisionTree.getRoot());
        
        // Invoke decision tree to start asking questions.
        myDecisionTree.queryTree(myDecisionTree.getRoot());
    }
    
}
