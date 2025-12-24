package graphbfs;

public class Vertex {
    public char label;       
    public boolean wasVisited;
    
    public Vertex(char label)
    {
        this.label = label;
        wasVisited = false;
    }
    public void displayVertex()
    {
        System.out.print(this.label);
    }
    public char getLabel()
    {
        return label;
    }
}
