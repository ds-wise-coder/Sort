package 박지인.DFSBFS;
import java.util.*;

public class pracStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();

        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st); //[1,2,3]
        
        st.pop();
        System.out.println(st);//[1,2]
        
        st.clear();
        System.out.println(st);//[]

    }
    
}
