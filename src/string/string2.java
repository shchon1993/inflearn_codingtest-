package string;

import java.util.Scanner;

public class string2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String result = "";

        for(int i = 0; i<str1.length();i++){
            int check = str1.charAt(i) - '0';

            if(check >= 49 && check <= 74){
                char ch1 = Character.toUpperCase(str1.charAt(i));
                result += String.valueOf(ch1);
                //System.out.println("소문자");
            }
            else if(check >= 17 && check <= 42){
                char ch2 = Character.toLowerCase(str1.charAt(i));
                result += String.valueOf(ch2);
                //System.out.println("대문자");
            }
        }
        //Character.isLowerCase();
        //Character.isUpperCase();
        System.out.println(result);
        //a 49 A 17
        //z 74 Z 42
    }

}
