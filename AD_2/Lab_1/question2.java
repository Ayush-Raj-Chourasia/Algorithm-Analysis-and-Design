



import java.util.ArrayList;

public class question2 {
    static class Edge {
        int src;
        int dst;
        int weight;
        public Edge(int s, int d,int weight) {
            this.src = s;
            this.dst = d;
            this.weight = weight;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0, 2,10));
        graph[1].add(new Edge(1, 2,3));
        graph[1].add(new Edge(1, 3,5));
        graph[2].add(new Edge(2, 0,10));
        graph[2].add(new Edge(2, 1,3));
        graph[2].add(new Edge(2, 3,2));
        graph[3].add(new Edge(3, 1,5));
        graph[3].add(new Edge(3, 2,2));
    }
    public static void main(String args[]) {
    	int V=4;
    	ArrayList<Edge> graph[]=new ArrayList[V];
    	createGraph(graph);
        for(int i=0;i<graph[2].size();i++) {
            Edge e = graph[2].get(i);
            System.out.println("Edge from " + e.src + " to " + e.dst+" weight "+e.weight);
        }
    }
}