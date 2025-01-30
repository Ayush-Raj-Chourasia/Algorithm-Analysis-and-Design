import java.util.ArrayList;

public class question3 {

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
        
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 1));
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));
        graph[1].add(new Edge(1, 4));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 7));
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));
        graph[5].add(new Edge(5, 4));
        graph[6].add(new Edge(6, 3));
        graph[6].add(new Edge(6, 7));   
        graph[7].add(new Edge(7, 2));
        graph[7].add(new Edge(7, 6));
    }

    public static void dfs(ArrayList<Edge> graph[], int curr, boolean[] vis) {
        System.out.print(curr + " ");
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dst]) {
                dfs(graph, e.dst, vis);
            }
        }
    }

    public static void main(String args[]) {
        int V = 8;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        
        boolean[] vis = new boolean[V];
        
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                dfs(graph, i, vis); 
                System.out.println();
            }
        }
    }
}