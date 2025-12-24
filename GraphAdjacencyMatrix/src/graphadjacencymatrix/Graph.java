package graphadjacencymatrix;

public class Graph {
    private int adjMat[][];  // 2D adjacency matrix
    private Vertex vertexList[];  // list of vertices in order 
    private int nVerts;  // number of vertices
    private int MAX_VERTS;  // max size unless otherwise overridden
    
    public Graph()
    {
        vertexList = new Vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;
        
        // Initalize the 2D array with zeros
        for (int i=0; i<MAX_VERTS; i++)
        {
            for (int j=0; j<MAX_VERTS; j++)
            {
                adjMat[i][j] = 0;
            }
        }
    }
    
    public Graph(int numVerts)
    {
        MAX_VERTS = numVerts;
        
        vertexList = new Vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;
        
        // Initalize the 2D array with zeros
        for (int i=0; i<MAX_VERTS; i++)
        {
            for (int j=0; j<MAX_VERTS; j++)
            {
                adjMat[i][j] = 0;
            }
        }
    }
    
    public void addVertex(String label)
    {
        if(nVerts < MAX_VERTS)
        {
            vertexList[nVerts++] = new Vertex(label);
        }
        else
        {
            System.out.println("Cannot add vertex!" + 
                    " Max size of vertex list exceeded!");
        }
    }
    
    public void addEdge(int start, int end)
    {
        adjMat[start][end] = 1;
        adjMat[end][start] = 1;
    }
    
    public void displayAdjMatrix()
    {
        // Display vertex labels across the top using vertexList
        for(int i=0; i<nVerts; i++)
        {
            System.out.print(vertexList[i].getLabel() + "     ");
        }
        System.out.println();
        
        // Display edges between vertices in the adjMat
        for(int x=0; x<nVerts; x++)
        {
            for(int y=0; y<nVerts; y++)
            {
                if(adjMat[x][y] == 1)
                {
                    System.out.print(adjMat[x][y] + "     ");
                }
                else
                {
                    System.out.print("0     ");
                }
            }
            System.out.println();
        }
    }
}
