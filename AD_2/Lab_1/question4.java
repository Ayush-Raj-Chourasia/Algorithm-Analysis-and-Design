import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class question4 {

    static class Edge {
        int src;
        int dst;

        public Edge(int s, int d) {
            this.src = s;
            this.dst = d;
        }
    }


    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

       
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 4));
        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 6));
        graph[2].add(new Edge(2, 7));
        graph[3].add(new Edge(3, 4));
        graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));
        graph[5].add(new Edge(5, 4));
        graph[6].add(new Edge(6, 2));
        graph[6].add(new Edge(6, 7));   
        graph[7].add(new Edge(7, 2));
        graph[7].add(new Edge(7, 6));
        graph[8].add(new Edge(8, 9));
        graph[9].add(new Edge(9, 8));
        graph[10].add(new Edge(10, 11));
        graph[11].add(new Edge(11, 10));
    }

    
    public static void bfs(ArrayList<Edge> graph[], int V) {
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<Integer>();

     
        queue.add(0);

        while (!queue.isEmpty()) {
            int curr = queue.remove();
            
            
            if (!visited[curr]) { 
                System.out.print(curr + " ");
                visited[curr] = true;
                
                
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    if (!visited[e.dst]) { 
                        queue.add(e.dst);
                    }
                }
            }
        }
    }

  
    public static void main(String args[]) {
        int V = 12;  
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        bfs(graph, V);
    }
}
