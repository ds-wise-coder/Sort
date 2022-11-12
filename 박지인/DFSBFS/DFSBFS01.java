package 박지인.DFSBFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//특정 거리의 도시 찾기
public class DFSBFS01 {
    public static int n, m, k, x;
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    //모든 도시의 최단 거리
    public static int[] count = new int[300001];
    
    //graph에 인접 도시 정보 저장
    public static void putEdge(ArrayList<ArrayList<Integer>> graph, int x, int y) {
        if (!graph.get(x).contains(y)) {
            graph.get(x).add(y);
        }
        if (!graph.get(y).contains(x)) {
            graph.get(y).add(x);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();
        x = sc.nextInt();

        //그래프, 최단거리 배열 초기화
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
            count[i] = -1;
        }
        
        //도로 정보 입력
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            putEdge(graph, x, y);
        }
        
        //출발도시 거리는 0으로 초기화
        count[x] = 0;

        //bfs
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(x);
        while (q.size() > 0){
            int v = q.poll();
            //현재 도시에 인접한 도시 모두 확인
            for (int i : graph.get(v)) {
                //아직 방문하지 않은 도시이면
                if (count[i] == -1) {
                    count[i] = count[v] + 1;
                    q.add(i);
                }
            }
        }

        int check = -1;
        for (int i = 1; i <= n; i++) {
            if (count[i] == k) {
                System.out.println(i);
                check = 1;
            }
        }
        
        if(check==-1) System.out.println(-1);

        sc.close();
    }
    
}
