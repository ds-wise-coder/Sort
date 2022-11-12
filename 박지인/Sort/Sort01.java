package 박지인.Sort;

import java.util.*;

//국영수 문제
class Student implements Comparable<Student> {

    private String name;
    private int kor;
    private int eng;
    private int m;

    public Student(String name, int kor, int eng, int m) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.m = m;
    }

    public String getName() {
        return this.name;
    }

    // 정렬 기준은 '점수가 낮은 순서'
    @Override
    public int compareTo(Student other) {
        if (this.kor == other.kor && this.eng == other.eng && this.m == other.m) {
            return this.name.compareTo(other.name);
        }
        if (this.kor == other.kor && this.eng == other.eng) {
            return Integer.compare(other.m, this.m);
        }
        if (this.kor == other.kor) {
            return Integer.compare(this.eng, other.eng);
        }
        return Integer.compare(other.kor, this.kor);
    }
}


public class Sort01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int kor = sc.nextInt();
            int eng = sc.nextInt();
            int m = sc.nextInt();
            students.add(new Student(name, kor, eng, m));
        }

        Collections.sort(students);

        // 정렬된 학생 정보에서 이름만 출력
        for (int i = 0; i < n; i++) {
            System.out.println(students.get(i).getName());
        }
    }
}
