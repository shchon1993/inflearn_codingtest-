package array;

import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {

        //반복문 돌면서 현재 가장 큰 키를 저장하여 갱신시킬 변수 선언
        //돌면서 해당 키보다 크면 선생님이 볼 수 있으므로 해당 변수 값 갱신 후 result++

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[] = new int[N];

        int max = Integer.MIN_VALUE;
        int result = 0;

        for(int i = 0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i<N; i++){
            if(max < arr[i]){
                result++;
                max = arr[i];
            }
        }

        System.out.println(result);


    }
}
