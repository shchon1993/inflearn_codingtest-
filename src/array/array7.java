package array.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class array7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String temp = br.readLine();
        String str[] = temp.split(" ");

        //입력 받은 후
        //반복문 돌면서 0이 아닐경우 cnt 증가 그 다음 결과값 배열에 넣음
        //0일 경우 0으로 초기화 후 배열에 넣음
        //마지막에 결과값 배열에 저장되어있는 값 전부다 합해서 출력.

        int score[] = new int[N];
        int result[] = new int[N];
        for(int i = 0; i<N;i++){
            score[i] = Integer.parseInt(str[i]);
        }
        int cnt = 0;

        for(int i = 0; i<N; i++){
            if(score[i] != 0){
                cnt ++;
                result[i] = cnt;
            }
            else{
                cnt = 0;
                result[i] = 0;
            }
        }

        int val = 0;
        for(int i = 0; i<N; i++){
            val += result[i];
        }

        System.out.println(val);

    }
}
