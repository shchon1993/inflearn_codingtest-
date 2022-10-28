package array;

import java.util.Scanner;

public class array4 {
    public static void main(String[] args) {
        //피보나치는 크게 재귀, DP로 푼다.
        //재귀의 경우 시간복잡도때문에 큰 수가 나오면 터짐
        //DP로 풀어야 시간복잡도를 해결할 수 있다.

        //https://code-lab1.tistory.com/7
        //1. 재귀
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
/*
        for(int i = 0 ; i<N; i++){
            System.out.print(fibo(i)+ " ");
        }
*/
        //2. DP
        int arr[] = new int[N];
        arr[0] = 1;
        arr[1] = 1;

        for(int i = 2; i<N; i++){
            arr[i]  = arr[i-1] + arr[i-2];
        }

        for(int i = 0; i<N; i++){
            System.out.print(arr[i] + " ");
        }

    }
    public static int fibo(int a){
        if(a <= 1){
            return 1;
        }
        else{
            return fibo(a - 1) + fibo(a-2);
        }
    }
}
