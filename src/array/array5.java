package array;

import java.io.IOException;
import java.util.Scanner;

public class array5 {
    public static void main(String[] args) throws IOException {
        //에라토스테네스의 체
        //자기 자신의 배수는 소수가 아님.
        //반복문 돌면서 해당 배수에 소수 체크

        Scanner sc = new Scanner(System.in);
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //int N = Integer.parseInt(br.readLine());
        int N = sc.nextInt();
        boolean check[] = new boolean[N+1];

        for(int i = 2; i<=N; i++){
            if(!check[i]){
                for(int j = i+i; j<=N; j=j+i){
                    //System.out.println(j);
                    check[j] = true;
                }
            }
        }

        int result = 0;
        for(int i = 2; i<=N; i++){
            if(!check[i]) {
            //System.out.print(i +" ");
                result++;
            }
        }
        //System.out.println();

        System.out.println(result);

    }
}
