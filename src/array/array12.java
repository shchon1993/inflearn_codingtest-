package array.src;

import java.util.Scanner;

public class array12 {
    public static void main(String[] args) {
        //각 배열을 입력 받은후
        //복사해서 동일한 크기의 배열을 하나 더 생성. 0으로 초기화
        //반복문 돌면서 3 4 1 2 일 경우 3,4 / 3,1 / 3,2  +1씩 증가 반대로 4,3 / 1,3 / 2,3은 -1씩 감소.
        //전체 다 체크 후 결과 값 배열에서 M이랑 동일한 값 찾아서 갯 수 출력. 왜냐하면 M이랑 같을 경우 M번의 수학시험동안 모두 그 해당 번호는 이긴 것이므로.

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int arr[][] = new int[M][N];
        int temp[][] = new int[N+1][N+1];
        for(int i = 0 ;i<M; i++){
            for(int j = 0; j<N; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int i = 0, j = 0;
        while(true){
            if(j == N-1){
                i++;
                j=0;
            }
            if(i == M){
                break;
            }
            for(int a = j+1; a<N;a++){
                //System.out.println(arr[i][j] +" " +arr[i][a]);
                temp[arr[i][j]][arr[i][a]] += 1;
                temp[arr[i][a]][arr[i][j]] -= 1;
            }

            j++;
        }
        int result = 0;
          for(int a = 1 ;a<N+1; a++){
            for(int b = 1; b<N+1; b++){
                //System.out.print(temp[a][b] +" ");
                if(temp[a][b] == M)
                    result++;
            }
        }
        System.out.println(result);

    }
}
