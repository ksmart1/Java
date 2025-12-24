package graphbfs;

public class GraphBFS {

    public static void main(String[] args) {
        Graph myGraph = new Graph();
        
        myGraph.addVertex('A');  // 0
        myGraph.addVertex('B');  // 1
        myGraph.addVertex('C');  // 2
        myGraph.addVertex('D');  // 3
        myGraph.addVertex('E');  // 4
        
        myGraph.addEdge(0, 1);  // AB
        myGraph.addEdge(1, 2);  // BC
        myGraph.addEdge(3, 4);  // DE
        myGraph.addEdge(1, 4);  // BD
        
        System.out.print("Visited: ");
        
        myGraph.bfs();
    }
    
}
