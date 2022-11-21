package StackQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class stackque7 {
    public static void main(String[] args) throws IOException {
        Queue<Character> que1 = new LinkedList<>();
        Queue<Character> que2 = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input_arr = br.readLine();
        for(char c : input_arr.toCharArray()){
            que1.add(c);
        }
        input_arr = br.readLine();
        for(char c : input_arr.toCharArray()){
            que2.add(c);
        }
        //que2 peek를 뺀 후 que1 peek와 비교
        //이때 동일하거나, que1 사이즈만큼 다 돌았는데 없을 경우 동일한 내용이 없으므로 그대로 넘어감
        //하지만, que1 ,que2 비교후 위 값이 아닌 다른 값으로 빠지면 NO
        String result = "YES";
        int cnt = 0;
        while(true){
            if(result == "NO" || que1.size() == 0)
                break;

            int que1_num = que1.peek();
            int que2_num = que2.peek();
            if(cnt == que1.size()){
                que2.remove();
                cnt = 0;
            }
            else {
                if (que1_num == que2_num) {
                    if(cnt != 0)
                        result = "NO";
                    else {
                        que1.remove();
                        que2.remove();
                    }
                } else {
                    char temp = que1.remove();
                    que1.add(temp);
                    cnt++;
                }
            }

        }
        System.out.println(result);
    }
}
