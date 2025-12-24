package graphbfs;

public class Graph {
    private Vertex vertList[];  // List of vertices in graph
    private int[][] adjMatrix;  // List of edges in graph
    private Queue theQueue;
    private int MAX_VERTS = 20;
    private int nVerts;  // total number of vertices in graph
    
    public Graph()
    { 
        vertList = new Vertex[MAX_VERTS];
        adjMatrix = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;
        theQueue = new Queue(MAX_VERTS);
        
        for(int i=0; i<MAX_VERTS; i++)
        {
            for(int j=0; j<MAX_VERTS; j++)
            {
                adjMatrix[i][j] = 0;
            }
        }
    }
    
    public Graph(int size)
    {
        MAX_VERTS = size;
        vertList = new Vertex[MAX_VERTS];
        adjMatrix = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;
        theQueue = new Queue(MAX_VERTS);
        
        for(int i=0; i<MAX_VERTS; i++)
        {
            for(int j=0; j<MAX_VERTS; j++)
            {
                adjMatrix[i][j] = 0;
            }
        }
    }
    
    public void addVertex(char label)
    {
        vertList[nVerts++] = new Vertex(label);
    }
    
    public void addEdge(int start, int end)
    {
        adjMatrix[start][end] = 1;
        adjMatrix[end][start] = 1;
    }
    
    public void bfs()
    {
        int v1, v2;
        vertList[0].wasVisited = true;
        vertList[0].displayVertex();
        theQueue.insert(0);
        
        while(!theQueue.isEmpty())
        {
            v1 = theQueue.remove();
            while((v2 = getAdjUnvisitedVert(v1)) != -1)
            {
                vertList[v2].wasVisited = true;
                vertList[v2].displayVertex();
                theQueue.insert(v2);
            }
        }
        
        // after search, reset all visited flags
        for(int i=0; i<nVerts; i++)
        {
            vertList[i].wasVisited = false;
        }
    }
    
    public int getAdjUnvisitedVert(int v)
    {
        for(int j=0; j<nVerts; j++)
        {
            if(adjMatrix[v][j] == 1 && vertList[v].wasVisited == false)
            {
                return j;
            }
        }
        return -1;
    }
}
