import java.util.Iterator;
import java.util.LinkedList;

public class tugas2 {
    private LinkedList<Integer> adj[];
    private boolean visited[];

    tugas2(int V){
        adj = new LinkedList[V];
        visited = new boolean[V];

        for (int i = 0; i < V; i ++){
            adj[i] = new LinkedList<Integer>();
        }

    }

    void insertEdge(int src, int dest){
        adj[src].add(dest);
    }

    void DFS(int vertex){
        visited[vertex] = true;
        System.out.print(vertex + " ");

        Iterator<Integer> it = adj[vertex].listIterator();
        while (it.hasNext()){
            int n = it.next();
            if (!visited[n]){
                DFS(n);
            }
        }
    }

    public static void main(String[] args) {
        tugas2 graph = new tugas2(12);

        graph.insertEdge(1,2);
        graph.insertEdge(1,4);
        graph.insertEdge(2,1);
        graph.insertEdge(2,5);
        graph.insertEdge(4,6);
        graph.insertEdge(5,2);
        graph.insertEdge(5,3);
        graph.insertEdge(5,7);
        graph.insertEdge(5,9);
        graph.insertEdge(6,7);
        graph.insertEdge(7,6);
        graph.insertEdge(7,11);
        graph.insertEdge(8,9);
        graph.insertEdge(8,11);
        graph.insertEdge(9,5);
        graph.insertEdge(9,8);
        graph.insertEdge(11,7);
        graph.insertEdge(11,10);

        System.out.println("Depth First Transversal For The Graph Is: ");
        graph.DFS(1);
    }

}