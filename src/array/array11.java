package array.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class array11 {
    public static int N;
    public static int arr[][];
    public static boolean tf[][];

    public static void main(String[] args) throws IOException {
        //첫번째 실수 : 중복 제거 안했음. 해당 번호와 같은반 되었을 때 계속 증가 시켰음. 한번이라도 같은반되었으면 더이상 체크 안해도됨
        //두번쨰 실수 : 5학년까지인거 인지 못했음.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(br.readLine());
        arr = new int[N][5]; //번호, 학년 입력받을 배열
        tf = new boolean[N][N]; //어떤 번호랑 같은 반이 였는지 체크하는 boolean 배열 중복 방지 한번 같은반이면 더이상 체크 안함.
        for(int i = 0; i<N; i++){
            String str = br.readLine();
            String strarr[] = str.split(" ");
            for(int j = 0; j<5; j++){
                arr[i][j] = Integer.parseInt(strarr[j]);
            }
        }
        int check = 0;
        int i = 0,j = 0;

        while(true){
            if(i == N){ //i가 1일경우 1번부터 N번까지 다 돌면 그다음 학년(j)를 체크해야하기때문에 j를 증가시키고 i는 다시 0(1학년)으로 초기화
                j++;
                i=0;
            }
            if(j == 5) //j가 5일때 즉 5학년까지 체크 다하면 종료
                break;
            check = arr[i][j];
            for(int a = 0; a<N; a++){
                    if (check == arr[a][j]) { //자기 자신도 포함하여 만약 같은반이면 true 처리
                       tf[i][a] = true;
                    }
            }
            i++; //번호 증가
        }

       /* for(int a = 0; a<N; a++){
            for(int b = 0; b<N; b++){
                System.out.print(tf[a][b] +" ");
            }
            System.out.println();
        }*/

        int min = Integer.MIN_VALUE;

        int cnt = 0;
        int result = 0;
        for(int a = 0; a<N; a++){
            for(int b = 0; b<N; b++){
                if(tf[a][b] == true){
                    cnt++;
                }
            }
            //System.out.println(cnt);
            if(min<cnt){
                min = cnt;
                result = a+1;

            }
            cnt = 0;

        }
        System.out.println(result);



    }
}
