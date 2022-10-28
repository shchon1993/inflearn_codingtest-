package twopointalgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class twopointeralgo3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String strarr[] = str.split(" ");
        int NK[] = new int[2];
        for(int i = 0; i<strarr.length;i++){
            NK[i] = Integer.parseInt(strarr[i]);
        }
        int arr[] = new int[NK[0]];
        str = br.readLine();
        strarr = str.split(" ");
        for(int i = 0; i<strarr.length;i++){
            arr[i] = Integer.parseInt(strarr[i]);
        }

        //슬라이딩 윈도우, 문자열 길이만큼 for문을 한번만 돌아서 창문 크기만큼 더해주고,뺴주고 반복
        int MAX = 0;
        int cal = 0;

        for(int i =0; i<NK[1];i++){
            cal+=arr[i];
        }
        MAX = cal;

        for(int i = NK[1]; i<arr.length;i++){
            cal += arr[i];
            cal -= arr[i-NK[1]];
            MAX = Math.max(MAX,cal);

        }
        System.out.println(MAX);



        //시간초과 2중 for문이기 때문에 O(n^2) N(5<=N<=100,000)과 K(2<=K<=N)
        /*
        int p1 = 0;
        int p2 = NK[1]-1;

        int MAX = Integer.MIN_VALUE;

        while(true){
            if(p2 == NK[0]){
                break;
            }
            int cal = 0;
            for(int i = p1; i<=p2; i++){
                cal += arr[i];
            }
            MAX = Math.max(cal,MAX);

            p1++;
            p2++;

        }
        System.out.println(MAX);
        */





    }
}
