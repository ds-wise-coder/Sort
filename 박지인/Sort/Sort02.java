package 박지인.Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Sort02 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            linkedList.add(sc.nextInt());
        }

        Collections.sort(linkedList);

        // 중간값(median)을 출력
        System.out.println(linkedList.get((n - 1) / 2));
    }
}
