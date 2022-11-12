package 박지인.DFSBFS;

public class Adjacency_matrix {
    public static void main(String[] args) {
        int INF = 999999999;

        int[][] graph={
            {0,7,5},
            {7,0,INF},
            {5,INF,0}
        };

        System.out.println(graph);

    }
    
}
