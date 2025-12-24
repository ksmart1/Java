package decisiontreenonrecursive;
import java.util.Stack;
import java.util.Scanner;

public class DecisionTree {
    private Node root;
    Scanner sc = new Scanner(System.in);
    
    public DecisionTree()
    {
        root = null;
    }
    
    public void setRoot(Node root) { this.root = root; }
    
    public void createRoot(int newRootNodeID, String question)
    {
        root = new Node(newRootNodeID, question);
    }
    
    public Node getRoot()
    {
        return root;
    }
    
    public void insertYesNode(int existingNodeID, int newNodeID, String question)
    {
        Node newNode = new Node(newNodeID, question);
        
        Stack bTreeStack = new Stack();
        
        bTreeStack.push(root); // Add root to start stack
        while(!bTreeStack.isEmpty())
        {
            Node nextNode = (Node) bTreeStack.pop();
            if(existingNodeID == nextNode.nodeID)
            {
                if(nextNode.yesBranch == null)
                {
                    nextNode.yesBranch = newNode;
                    return;
                }
            }
            
            if(nextNode.yesBranch != null)
            {
                bTreeStack.push(nextNode.yesBranch);
            }
            if(nextNode.noBranch != null)
            {
                bTreeStack.push(nextNode.noBranch);
            }
        }
    }
    
    public void insertNoNode(int existingNodeID, int newNodeID, String question)
    {
        Node newNode = new Node(newNodeID, question);
        
        Stack bTreeStack = new Stack();
        
        bTreeStack.push(root); // Add root to start stack
        while(!bTreeStack.isEmpty())
        {
            Node nextNode = (Node) bTreeStack.pop();
            if(existingNodeID == nextNode.nodeID)
            {
                if(nextNode.noBranch == null)
                {
                    nextNode.noBranch = newNode;
                    return;
                }
            }
            
            if(nextNode.noBranch != null)
            {
                bTreeStack.push(nextNode.yesBranch);
            }
            if(nextNode.yesBranch != null)
            {
                bTreeStack.push(nextNode.noBranch);
            }
        }
    }
    
    public void displayPreOrder(Node root)
    {
        if(root != null)
        {
            root.displayNode();
            displayPreOrder(root.yesBranch); // Recurse down yes side
            displayPreOrder(root.noBranch); // Recurse down no side
        }
    }
    
    public void queryTree(Node currentNode)
    {
        if(currentNode.yesBranch == null)
        {
            if(currentNode.noBranch == null)
            {
                System.out.print(currentNode.question);
                return;
            }
        }
        
        askQuestion(currentNode);
    }
    
    public void askQuestion(Node currentNode)
    {
        System.out.print(currentNode.question + "(Enter Y\\N): ");
        String answer = sc.nextLine().toLowerCase();
        if(answer.equals("y"))
        {
            if(currentNode.yesBranch != null)
            {
                queryTree(currentNode.yesBranch);
            }
        }
        else if (answer.equals("n"))
        {
            if(currentNode.noBranch != null)
            {
                queryTree(currentNode.noBranch);
            }
        }
        else
        {
            System.out.print("Input Error: " + "must answer \"Yes\" or \"No\"");
        }
    }
}
