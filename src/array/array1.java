package array;

import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
         //큰 수 출력
         //반복문 돌면서 현재 인덱스의 값이 전 인덱스의 값보다 크면
         //결과갑에 저장


        Scanner sc = new Scanner(System.in);

        int N  = sc.nextInt();
        int arr[] = new int[N];
        int result[] = new int[N];

        for(int i = 0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        result[0] = arr[0];

        for(int i = 1; i<N; i++){
            if(arr[i] > arr[i-1]){
                result[i] = arr[i];
            }
        }

        for(int i = 0; i<N; i++){
            if(result[i] != 0)
                 System.out.print(result[i] + " ");
        }



    }
}
