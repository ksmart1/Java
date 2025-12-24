package graphadjacencymatrix;

public class Vertex {
    private String label;
    public boolean wasVisited;
    
    public Vertex()
    {
        // Default constructor
    }
    
    public Vertex(String label)
    {
        this.label = label;
        wasVisited = false;
    }
    
    public void setLabel(String label)
    {
        this.label = label;
    }
    
    public String getLabel()
    {
        return this.label;
    }
    
    public void disaplyVertex()
    {
        System.out.print(this.label);
    }
}
