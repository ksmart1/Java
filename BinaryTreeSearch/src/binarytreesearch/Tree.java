package binarytreesearch;

public class Tree {
    // Create pointer for root of tree
    private Node root;
    
    public Tree()
    {
        // Default constructor
        root = null;
    }
    
    public Node getRoot()
    {
        return root;
    }
    
    public void insert(String iData)
    {
        Node newNode = new Node();
        newNode.setIData(iData);
        
        if(root == null)
        {
            root = newNode;
        }
        else
        {
            Node current = root;
            Node parent;
            
            while(true)
            {
                parent = current;
                if(iData.compareTo(current.getIData()) < 0)
                {
                    current = current.leftChild;
                    if(current == null)
                    {
                        parent.leftChild = newNode;
                        return;
                    }
                }
                else
                {
                    current = current.rightChild;
                    if(current == null)
                    {
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }
    
    public Node findPreOrder(String key, Node root)
    {
        Node current = root;
        
        while(!current.getIData().equalsIgnoreCase(key))
        {
            if(current.getIData().compareTo(key) < 0)
            {
                current = current.leftChild;
            }
            else
            {
                current = current.rightChild;
            }
            if(current == null)
            {
                return null;
            }
        }
        
        return current;
    }
    
    public void preOrder(Node root)
    {
        if(root != null)
        {
            System.out.print(" ");
            root.displayNode();
            
            preOrder(root.leftChild);
            preOrder(root.rightChild);
        }
    }
    
    public void displayPaths(Node node, String path) 
    {
        if (node == null) return;

        // Append current node's data to the path
        path += node.getIData();

        // If the current node is a leaf node, print the path
        if (node.leftChild == null && node.rightChild == null) {
            System.out.println(path);
            return;
        }

        displayPaths(node.leftChild, path + "->");
        displayPaths(node.rightChild, path + "->");
    }
}
