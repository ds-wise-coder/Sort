package 박지인.DFSBFS;

import java.util.*;
public class pracQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q);//[1,2,3]

        q.poll();
        System.out.println(q);//[2,3]

        q.clear();
        System.out.println(q);//[]
    }
}
