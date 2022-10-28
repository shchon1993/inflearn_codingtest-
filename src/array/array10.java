package array.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class array10 {
    public static int N;
    public static int arr[][];
    public static int arr_temp[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new int[N+2][N+2];
        arr_temp = new int[N+2][N+2];
        int result = 0 ;
        for(int i = 1; i<=N; i++){
            String str = br.readLine();
            String strarr[] = str.split(" ");
            for(int j = 0; j<N; j++){
                arr[i][j+1] = Integer.parseInt(strarr[j]);
            }
        }
        find();

        for(int i =1; i<=N; i++){
            for(int j =1; j<=N; j++){
               if(arr_temp[i][j] == 1)
                   result++;
            }
        }

        System.out.println(result);


    }
    public static void find(){
        for(int i =1; i<=N; i++){
            for(int j =1; j<=N; j++){
                //상 하 좌 우
                if((arr[i][j] > arr[i][j-1]) && (arr[i][j] > arr[i][j+1]) && (arr[i][j] > arr[i-1][j]) && (arr[i][j] > arr[i+1][j])){
                    arr_temp[i][j] = 1;
                }

            }
        }
    }

}
