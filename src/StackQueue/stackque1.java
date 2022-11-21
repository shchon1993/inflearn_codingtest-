package StackQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class stackque1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        Stack<Character> st = new Stack<>();

        String result = "YES";
        for(int i = 0; i<input.length();i++){
            if(input.charAt(i) == '('){
                st.push('(');
            }
            else{
                if(st.isEmpty()){
                    result = "NO";
                    break;
                }
                st.pop();
            }
        }
        if(!st.isEmpty()){
            result = "NO";
        }
        System.out.println(result);

    }
}
