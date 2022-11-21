package StackQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class stackque6 {
    public static void main(String[] args) throws IOException {
        Queue<Integer> que = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input_arr[] = br.readLine().split(" ");
        int N = Integer.parseInt(input_arr[0]);
        int K = Integer.parseInt(input_arr[1]);
        for(int i = 1; i<=N;i++){
            que.add(i);
        }

        int cnt = 1;
        while(true){
            if(que.size() == 1)
                break;
            if(cnt == K){
                que.remove();
                cnt = 1;
            }
            int number = que.peek();
            que.add(number);
            //System.out.println(number);
            que.remove();
            //System.out.println(que.peek());
            cnt++;
        }

        System.out.println(que.peek());
    }
}
