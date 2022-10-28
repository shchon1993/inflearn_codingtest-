package string;

import java.util.Scanner;

public class string9 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String result = "";
        for(int i = 0; i<str.length();i++){
            if(Character.isDigit(str.charAt(i))){ //숫자인지 문자인지 판별
                result += String.valueOf(str.charAt(i)); //숫자만 String 변수에 넣음

            }
        }

        System.out.println(Integer.valueOf(result)); //문자열을 숫자로 변환


    }
}
