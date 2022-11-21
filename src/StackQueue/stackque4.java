package StackQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class stackque4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //352+*9-
        String input = br.readLine();
        Stack<Integer> st = new Stack<>();
        int result = 0;
        for(char c : input.toCharArray()){
            if(c == '+'){
                int a = st.pop() ;
                int b = st.pop() ;
                result = b + a;
                st.push(result);
            }
            else if(c == '-'){
                int a = st.pop();
                int b = st.pop() ;
                result = b - a;
                st.push(result);
            }
            else if(c == '*'){
                int a = st.pop() ;
                int b = st.pop() ;
                result = b * a;
                st.push(result);
            }
            else if(c == '/'){
                int a = st.pop();
                int b = st.pop() ;
                result = b / a;
                st.push(result);
            }
            else {
                st.push(c - '0');
            }
        }
        System.out.println(st.peek());

    }
}
