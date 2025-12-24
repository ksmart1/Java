package binarytreesearch;

public class Node {
    private String iData; // key value - the data being stored
    public Node leftChild;
    public Node rightChild;
    
    public Node()
    {
        // Default constructor
    }
    
    public Node(String iData)
    {
        this.iData = iData;
    }
    
    public void setIData(String iData)
    {
        this.iData = iData;
    }
    
    public String getIData()
    {
        return this.iData;
    }
    
    public void displayNode()
    {
        System.out.print("(" + iData + ")");
    }
}
