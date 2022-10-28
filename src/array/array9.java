package array.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class array9 {
    public static int N;
    public static int arr[][];
    public static  int result_num = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        arr = new int[N][N];
        for(int i = 0; i<N; i++){
            String str = br.readLine();
            String strarr[] = str.split(" ");
            for(int j = 0; j<N; j++){
                arr[i][j] = Integer.parseInt(strarr[j]);
            }
        }

        //가로,세로,각 대각선 합 구한 후 가장 큰 값 출력

        compare(row(),column(),rcross(),lcross());

        System.out.println(result_num);


    }
    public static int compare(int row, int column , int rcross, int lcross){
        int comp1 = 0;
        if(row >=  column)
            comp1 = row;
        else
            comp1 = column;

        int comp2 = 0;

        if(rcross >=  lcross)
            comp2 = rcross;
        else
            comp2 = lcross;

        if(comp1 >= comp2)
            result_num = comp1;
        else result_num = comp2;

        return result_num;
    }
    public static int row(){
        int result = Integer.MIN_VALUE;

        int temp = 0;
        for(int i = 0; i<N; i++){
            for(int j = 0; j<N; j++){
                temp += arr[i][j];
            }
            if(result < temp){
                result = temp;
            }
            temp = 0;
        }

        return result;
    }
    public static int column(){
        int result = Integer.MIN_VALUE;

        int temp = 0;
        for(int i = 0; i<N; i++){
            for(int j = 0; j<N; j++){
                temp += arr[j][i];
            }
            if(result < temp){
                result = temp;
            }
            temp = 0;
        }

        return result;
    }
    public static int rcross(){
        int result = 0;

        for(int i = 0; i<N; i++){
            for(int j = 0; j<N; j++){
                if(i == j)
                    result+= arr[i][j];
            }

        }

        return result;
    }
    public static int lcross(){
        int result = 0;

        for(int i = 0; i<N; i++){
            for(int j = 0; j<N; j++){
                if( (i + j) == N-1)
                    result+= arr[i][j];
            }

        }

        return result;
    }

}
