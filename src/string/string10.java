package string;

import java.util.Scanner;

public class string10 {
    public static void main(String args[]){
        //문자열을 받은 후 문자열 전체 길이 만큼 반복문으로 돌리면서
        //인덱스별 각 문자와 와 비교해야하는 문자간 길이를 구한다. 문자열 전체 길이까지
        //반복문을 돌리면서 최소값 비교를 통해 최소값만 저장.


        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String c = sc.next();
        int result[] = new int[str.length()];
        int cnt = 0;

        for(int i = 0; i<str.length(); i++){
            cnt = Integer.MAX_VALUE;
            for(int j = 0; j<str.length();j++) {
             if(c.equals(String.valueOf(str.charAt(j)))){
                  int temp = Math.abs(i-j);
                  if(cnt>=temp){
                      cnt = temp;
                  }
             }
           }
            result[i] = cnt;

       }

        for(int i = 0; i<result.length;i++){
            System.out.print(result[i] +" ");
        }
        System.out.println();



    }
}
