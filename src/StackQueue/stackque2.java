package StackQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class stackque2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        Stack<Character> st = new Stack<>();

        for(char ch : input.toCharArray()){
            if(ch==')'){
                while(true){
                    char temp = st.pop();
                    if(temp == '(')
                        break;
                }
            }
            else
                st.push(ch);
        }

        String result = "";
        while(!st.isEmpty()){
            result = st.pop() + result;
        }

        System.out.println(result);
    }



}
