package StackQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class stackque3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int map[][] = new int[N+1][N+1];
        for(int i = 1; i<=N; i++){
            String temp = br.readLine();
            for(int j = 1; j<=N;j++){
                String arr_temp[] = temp.split(" ");
                map[i][j] = Integer.parseInt(arr_temp[j-1]);
            }
        }
        int moves = Integer.parseInt(br.readLine());
        int moves_arr[] = new int[moves+1];
        String temp = br.readLine();
        for(int i = 1;i <= moves; i++){
            String arr_temp[] = temp.split(" ");
            moves_arr[i] = Integer.parseInt(arr_temp[i-1]);
        }
        /*
        1. 스택 선언
        2. moves 배열에 들어온 순서대로 스택에 넣고, 스택에 넣을때 peek 값이랑 동일하면 넣지 않고 pop
        3. pop할때 cnt 증가
         */

        Stack<Integer> st = new Stack<>();
        int cnt = 1;
        int number = 0;
        int result = 0;
        while(true){
            if(cnt == moves+1)
                break;

            for(int i = 1; i<=N; i++) {
                if (map[i][moves_arr[cnt]] != 0) {
                    number = map[i][moves_arr[cnt]];
                    map[i][moves_arr[cnt]] = 0;
                    break;
                }
            }
            if(!st.isEmpty()){
                if(st.peek().equals(number)){
                    st.pop();
                    result++;
                }
                else
                    st.push(number);
            }
            else
                st.push(number);

            cnt++;

        }
        System.out.println(result);


    }
}
