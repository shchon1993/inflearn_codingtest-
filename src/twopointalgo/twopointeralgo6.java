package twopointalgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class twopointeralgo6 {
    public static void main(String[] args) throws IOException {
        /*
          twopointalgo에 핵심은 lt,rt 선언
          lt,rt, cnt 선언
          lt,rt = 0 시작해서 길이 비교 rt-lt+1 -> 처음 길이가 1이기 때문
          rt 증가시키면서 rt-lt+1 값 갱신
          rt 인덱스 임시 배열이 0일 경우 1로 변경 후 rt-lt+1 값 갱신 이때 cnt++
          rt 인덱스 임시 배열이 0일 경우 cnt값 체크하여 K보다 클 경우에 원래 배열 초기값 lt부터 시작해서 전체 다돌면서 0나오면
          lt값 해당 인덱스 + 1 값으로 갱신 후 rt-lt+1 값 갱신, 이때 임시 배열의 lt 인덱스는 0으로 변경하고 cnt 감소.

         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input1 = br.readLine();
        String input2 = br.readLine();

        String inputarr1[] = input1.split(" ");
        String inputarr2[] = input2.split(" ");

        int N = Integer.parseInt(inputarr1[0]);
        int K = Integer.parseInt(inputarr1[1]);

        int arr[] = new int[N];
        int arr_temp[] = new int[N];

        for(int i =0 ; i<N; i++){
            arr[i] = Integer.parseInt(inputarr2[i]);
            arr_temp[i] = Integer.parseInt(inputarr2[i]);
        }

        int lt = 0 ,rt = 0;
        int cnt = 0;
        int answer = Integer.MIN_VALUE;

        while(true){
            if(rt == N)
                break;

            if(arr_temp[rt] == 0){
                cnt++;
                if(cnt>K){
                    for(int i = lt; i<input2.length();i++){
                        if(arr[i] == 0){
                            arr_temp[i] = 0;
                            lt = i+1;
                            cnt--;
                            break;
                        }
                    }
                }
                arr_temp[rt] = 1;
            }

            int answer_check = rt-lt+1;
            //System.out.println(answer_check);
            answer = Math.max(answer, answer_check);

            rt++;
        }

        System.out.println(answer);




    }
}
