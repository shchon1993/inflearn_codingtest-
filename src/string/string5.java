package string;

import java.util.Scanner;

public class string5  {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
           //nullnull#@!#!@null
        String str = sc.nextLine();

        String temp[] = new String[str.length()];

        for(int i = 0; i<str.length();i++){
            temp[i] = String.valueOf(str.charAt(i));
        }
        //Character.isLetter() -> 문자만 찾을 수 있음. 특수문자 제외

        String result[] = new String[str.length()];

        for(int i = 0; i<temp.length;i++){
            int check = temp[i].charAt(0) - '0';
            if((check < 49 || check > 74) && (check < 17 || check > 42)) {
                result[i] = temp[i];
            }
        }
/*
        for(int i = 0; i<result.length;i++){
            System.out.print(result[i]);
        }
*/
        int i = 0;
        int num = str.length()-1;
        while(true){
            if(i == result.length || num == -1)
                break;
            //System.out.println(num);
            int check = temp[num].charAt(0) - '0';
            if(result[i] != null){
                i++;
            }
            else{
                if((check >= 49 && check <= 74) || (check >= 17 && check <= 42)){
                    result[i] = temp[num];
                    i++;
                }
                num--;
            }

        }
        //System.out.println();
        for(int j = 0; j<result.length;j++){
            System.out.print(result[j]);
        }
        System.out.println();





    }
}
