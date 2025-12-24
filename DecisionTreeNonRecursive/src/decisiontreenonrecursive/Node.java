package decisiontreenonrecursive;

public class Node {
    public int nodeID;
    public String question;
    public Node yesBranch; // left child
    public Node noBranch; // right child
    
    public Node()
    {
        // Default constructor
    }
    
    public Node(int newNodeID, String question)
    {
        this.nodeID = newNodeID;
        this.question = question;
        this.yesBranch = null;
        this.noBranch = null;
    }
    
    public void displayNode()
    {
        System.out.println("NodeID = " + nodeID + ", " + question);
    }
    
    public void setNodeID(int newNodeID) { this.nodeID = newNodeID; }
    public void setQuestion(String question) { this.question = question; }
    public void setYesBranch(Node yesBranch) { this.yesBranch = yesBranch; }
    public void setNoBranch(Node noBranch) { this.noBranch = noBranch; }
    public int getNodeID(int newNodeID) { return this.nodeID; }
    public String getQuestion(String question) { return this.question; }
    public Node getYesBranch(Node yesBranch) { return this.yesBranch; }
    public Node getNoBranch(Node noBranch) { return this.noBranch; }
}
