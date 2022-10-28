package array.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class array6 {

    //전역변수로 선언
    //나름 함수로 구현해서 리팩토링 해봄.


    public static String str1[]; //입력받은 string split 저장 하기 위한 배열
    public static boolean check[] = new boolean[100001]; //소수 판별 배열
    public static  StringBuilder result = new StringBuilder(); //결과값 append

    //소수체크
    public static void numcheck(){
        //소수 체크
        int num[] = new int[100001];

        for(int i = 2; i<100001;i++){
            if(!check[i]){
                for(int j = i+i; j<100001; j=j+i){
                    check[j]  = true;
                }
            }
        }
        check[0] = true;
        check[1] = true;
    }
    //입력받은 문자열 중 각 문자을 거꾸로 뒤집어 정수로 만든 후 소수인지 판별하여 결과값에 저장
    public static void resultcheck(){
        for(int i = 0; i<str1.length; i++){
            StringBuilder sb = new StringBuilder();
            sb.append(str1[i]);
            String temp = sb.reverse().toString();

            int check_num = Integer.parseInt(temp);
            //System.out.println(check_num+" "+check[check_num]);
            if(!check[check_num])
                result.append(check_num+" ");
        }
    }

    public static void main(String[] args) throws IOException {

        //Scanner쓰지말고 BuffedReader로 사용하자
        //예전에 코테풀때 계속 BuffedReader로 풀었음. 입력받는 시간이 Scanner대비 빠르기도 하고
        //특정 문제풀때 Scanner로 입력받으면 시간 초과남. 이때 BufferedReader로 입력받아야 시간 문제 해결 했음.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String str = br.readLine();
        str1 = str.split(" ");

        numcheck();
        resultcheck();

        System.out.println(result);

        return;
    }
}
