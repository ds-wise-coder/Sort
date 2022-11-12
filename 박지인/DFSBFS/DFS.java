package 박지인.DFSBFS;

import java.util.Arrays;

public class DFS {
    public static void dfs(int[][] graph, int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");
        for (int i : graph[v]) {
            if (visited[i] == false) {
                dfs(graph, i, visited);
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
        
        dfs(graph, 1, visited);
    }
}
