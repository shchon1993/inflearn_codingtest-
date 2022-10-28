package string;

import java.util.Scanner;

public class string6 {
    public static void main(String args[]){
        //중복제거
        //문자열 입력 받은 후(str1)
        //다른 문자열에 중복이 제거된 문자를 넣을때 해당 문자열이 있는지 확인 후 넣는다.

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";

        for(int i = 0; i<str.length();i++){
            if(!result.contains(String.valueOf(str.charAt(i)))){
                result += String.valueOf(str.charAt(i));

            }
        }

        System.out.println(result);

    }
}
