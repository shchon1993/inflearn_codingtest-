package string;

import java.util.Scanner;

public class string7 {
    public static void main(String[] args){
        //회문 검사할때 대소문자를 구분하지 않는다고 했으니
        //입력 받자마자 소문자 또는 대문자로 변경
        //해당 문자열 길이만큼 처음부터 돌려서 하나 만들고 거꾸로 돌려서 하나 만들어서 같은지 비교

        //하늘 -> 시간생각해서 풀었음.
        /* int left = 0;
        int right = x.length()-1;
        boolean success = true;
        char [] array = x.toCharArray();
        while(left < right){
            if(array[left] != array[right]) {
                success = false;
                left = right;
            }else{
                left++;
                right--;
            }
        }
        }*/


        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        str = str.toLowerCase();

        String com1 = "";
        String com2 = "";

        String result = "";

        for(int i = 0; i<str.length(); i++){
            com1 += String.valueOf(str.charAt(i));
        }
        for(int i = str.length()-1; i>=0; i--){
            com2 += String.valueOf(str.charAt(i));
        }

        if(com1.equals(com2)){
            result = "YES";
        }
        else{
            result = "NO";
        }

        System.out.println(result);


    }
}
