package array;

import java.util.Scanner;

public class array3 {
    public static void main(String[] args) {

        //배열을 입력값대로 저장하는 것이 아닌, [N][2] 형태로 값을 저장하여  A,B 비교.

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[][] = new int[N][2];
        String result[] = new String[N];
        for(int i = 0; i<N; i++){
            arr[i][0] = sc.nextInt();
        }
        for(int i = 0; i<N; i++){
            arr[i][1] = sc.nextInt();
        }

        for(int i = 0; i<N; i++){
            //비겼을 때
            if(arr[i][0] == arr[i][1]){
                result[i] = "D";
            }
            else{ //아닐때
               result[i] = game(arr[i][0],arr[i][1]);
            }
        }

        for(int i = 0; i<N; i++){
            System.out.println(result[i]);
        }
        return;
    }
    public static String game(int A, int B){
        String result = "";
        if(A == 1 && B == 2){  //가위 vs 바위
            result = "B";
        }
        else if(A == 1 && B == 3){  //가위 vs 보
            result = "A";
        }
        else if(A == 2 && B == 1){  //바위 vs 가위
            result = "A";
        }
        else if(A == 2 && B == 3){  //바위 vs 보
            result = "B";
        }
        else if(A == 3 && B == 1){  //보 vs 가위
            result = "B";
        }
        else if(A == 3 && B == 2){  //보 vs 바위
            result = "A";
        }
        return result;

    }
}
