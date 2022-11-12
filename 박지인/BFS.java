package 박지인;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void bfs(int[][] graph, int start, boolean[] visited) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;
        while (q.size()>0) {
            int v = q.poll();
            System.out.print(v + " ");
            for (int i : graph[v]) {
                if (visited[i] == false) {
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] graph = {
            {},
            {2,3,8},
            {1,7},
            {1,4,5},
            {3,5},
            {3,4},
            {7},
            {2,6,8},
            {1,7}
        };

        //1~8까지 노드 첫0
        boolean[] visited = new boolean[9];
        Arrays.fill(visited, false);
        
        bfs(graph, 1, visited);
    }
    
}
