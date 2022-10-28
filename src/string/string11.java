package string;

import java.util.Scanner;

public class string11 {
    public static void main(String[] args){
        //문자열 입력 받고
        //문자별로 체크. 다음 문자가 이전 문자와 동일하면
        //cnt 증가. 다를까지 넣은 후 cnt가 1이 아니면 문자 옆에 붙임. 그리고 그다음 문자로 이동하여
        //반복
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int cnt = 1;

        char c = str.charAt(0);
        int i = 1;
        String result = "";
        while(true){

            if(c == str.charAt(i)){
                cnt++;
                i++;
                if(i == str.length()){ //마지막 종료조건에 넣어주는 로직이 없으니 마지막 문자값만 빼고 넣어주고 있음. 따라서 종료조건에 걸릴때 마지막 문자를 저장하고 있는 C 와 cnt에 저장되어있는 값을 결과값에 넣어준다.
                    result += String.valueOf(c);
                    if(cnt != 1)
                        result += String.valueOf(cnt);
                   // System.out.println(c + " "+ cnt);
                }
            }
            else{
                result += String.valueOf(c);
                c = str.charAt(i);
                i++;
                if(cnt != 1){
                    result += String.valueOf(cnt);
                    cnt = 1;
                }
                if(i == str.length()){ //마지막 종료조건에 넣어주는 로직이 없으니 마지막 문자값만 빼고 넣어주고 있음. 따라서 종료조건에 걸릴때 마지막 문자를 저장하고 있는 C 와 cnt에 저장되어있는 값을 결과값에 넣어준다.
                    result += String.valueOf(c);
                    if(cnt != 1)
                        result += String.valueOf(cnt);
                    //System.out.println(c + " "+ cnt);
                }
            }
            //종료조건
            if(i == str.length()){
                break;
            }
        }

        System.out.println(result);



    }
}
