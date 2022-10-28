package string;

import java.util.Scanner;

public class string1 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int result = 0;

       String str1 = sc.nextLine();
       String str2 = sc.nextLine();

       //대소문자 구분 없다고 하니 대문자 또는 소문자로 바꿔서 다시 넣기. toUpperCase() -> 대문자
       str1 = str1.toLowerCase();
       str2 = str2.toLowerCase();


       if(str1.length() < 100 && str2.length() < 100){
           for(int i = 0; i<str1.length(); i++){
               if(str1.charAt(i) == str2.charAt(0)){
                   result++;
               }

           }
       }

       System.out.println(result);

    }
}
