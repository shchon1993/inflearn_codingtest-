package array.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class array8 {
    public static void main(String[] args) throws IOException {

        //우선순위 큐를 써서 쉽게 풀 수 있으나 해당 챕터의 해결 방법은 아닌 거같음
        //등수를 저장할 배열을 선언해서 1로 초기화
        //나머지 값과 비교했을 때 작으면 +1 증가

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        int result[] = new int[N];

        String str = br.readLine();
        String strarr[] = str.split(" ");
        for(int i = 0; i<N; i++){
            arr[i] = Integer.parseInt(strarr[i]);
            result[i] = 1;
        }

        for(int i = 0; i<N; i++){
            int num = arr[i];
            for(int j = 0; j<N; j++){
                if(num<arr[j]){
                    result[i]++;
                }
            }
        }

        for(int i = 0; i<N; i++){
            System.out.print(result[i]+" ");
        }
        System.out.println();




    }
}
