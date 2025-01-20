package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class Topologicalsortbfs {
    public static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }
    public static void creategraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }
    public static void calIndeg(ArrayList<Edge> graph[], int[] indeg) {
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                indeg[e.dest]++;
            }
        }
    }
    public static void sort(ArrayList<Edge> graph[]){
        int indeg[]=new int[graph.length];
        calIndeg(graph, indeg);
        Queue<Integer> que=new LinkedList<>();

        for(int i=0;i<indeg.length;i++)
        {            
            if(indeg[i]==0)
            {
                que.add(i);
            }
        }
        while(!que.isEmpty())
        {
            int curr=que.remove();
            System.out.print(curr+" ");
            for(int i=0;i<graph[curr].size();i++)
            {
                Edge e=graph[curr].get(i);
                indeg[e.dest]--;
                if(indeg[e.dest]==0) que.add(e.dest);
            }
        }
        System.err.println();
    }
    public static void main(String args[]) {
        int v = 6;
        ArrayList<Edge> graph[] = new ArrayList[v];
        creategraph(graph);
        sort(graph);
    }

}
