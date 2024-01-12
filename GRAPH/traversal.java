package GRAPH;

import java.util.*;

public class traversal {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }

        public static void bfsOfGraph(ArrayList<Edge>[] graph) {
            int V = graph.length;
            boolean vis[] = new boolean[V];
            Queue<Integer> q = new LinkedList<>();
            // ArrayList<Integer> q = new ArrayList<>();
            q.add(0);
            vis[0] = true;
            while (!q.isEmpty()) {
                int curr = q.remove();
                if (!vis[curr]) {
                    System.out.print(curr + " ");
                    for (int i = 0; i < graph[curr].size(); i++) {
                        Edge e = graph[curr].get(i);
                        if (!vis[e.dest]) {
                            q.add(e.dest);
                            vis[e.dest] = true;
                        }
                    }
                }
            }

        }

        public static void main(String[] args) {
            int V = 5;
            ArrayList<Edge> graph[] = new ArrayList[V];

            for (int i = 0; i < V; i++) {
                graph[i] = new ArrayList<>();
            }
            graph[0].add(new Edge(0, 1, 5));

            graph[1].add(new Edge(1, 0, 5));
            graph[1].add(new Edge(1, 2, 1));
            graph[1].add(new Edge(1, 3, 5));

            graph[2].add(new Edge(2, 1, 1));
            graph[2].add(new Edge(2, 3, 1));
            graph[2].add(new Edge(2, 4, 4));

            graph[3].add(new Edge(3, 1, 3));
            graph[3].add(new Edge(3, 2, 1));

            graph[4].add(new Edge(4, 2, 2));

            // for (int i = 0; i < graph[1].size(); i++) {
            // Edge e = graph[1].get(i);
            // System.out.println(e.dest);
            // }
            bfsOfGraph(graph);

        }

    }

}