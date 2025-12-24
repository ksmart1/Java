package graphadjacencymatrix;

public class GraphAdjacencyMatrix {

    public static void main(String[] args) {
        Graph myGraph = new Graph(10);
        
        // Create list of vertices in the vertexList
        myGraph.addVertex("A"); // 0
        myGraph.addVertex("B"); // 1
        myGraph.addVertex("C"); // 2
        myGraph.addVertex("D"); // 3
        myGraph.addVertex("E"); // 4
        myGraph.addVertex("F"); // 5
        myGraph.addVertex("G"); // 6
        myGraph.addVertex("H"); // 7
        
        // Connect vertices together in the adjMat
        myGraph.addEdge(0, 3); // AD
        myGraph.addEdge(0, 4); // AE
        myGraph.addEdge(1, 4); // BE
        myGraph.addEdge(2, 5); // CF
        myGraph.addEdge(3, 6); // DG
        myGraph.addEdge(4, 6); // EG
        myGraph.addEdge(5, 7); // FH
        myGraph.addEdge(6, 7); // GH
        
        // Display adjMat
        myGraph.displayAdjMatrix();
    }
    
}
