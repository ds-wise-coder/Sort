package 박지인.DFSBFS;

import java.util.ArrayList;

public class Adjacency_list {
    public static void print(ArrayList<ArrayList<Integer>> graph) {
        for (int i = 0; i < graph.size(); i++) {
            ArrayList<Integer> node = graph.get(i);
            System.out.println("node" + "[" + i + "]");
            for (int j = 0; j < node.size(); j++) {
                System.out.print(node.get(j) + "->");
            }
            System.out.println();
        }
    }

    public static void putEdge(ArrayList<ArrayList<Integer>> graph, int x, int y) {
        if(!graph.get(x).contains(y))  
            graph.get(x).add(y);
        if(!graph.get(y).contains(x))
            graph.get(y).add(x);
        
    }

    public static void main(String[] args) {
        //그래프 총 노드 개수
        int n = 3;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        //각 노드별 리스트
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        putEdge(graph, 0, 1);
        putEdge(graph, 0, 2);
        putEdge(graph, 1, 0);
        putEdge(graph, 2, 0);

        print(graph);

    }
}
