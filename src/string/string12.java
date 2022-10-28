package string;

import java.util.Scanner;

public class string12 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        String str = sc.nextLine();

        String temp = "";
        double num = 0;
        String result = "";
        int cnt = 0;
        int i = 0;
        while(true){ //for문으로 돌리면 아래 cnt == 7조건 때문에 마지막 문자열 변환을 못함. 따라서 무한루프로 돌리고 종료조건을 cnt == 7 아래로 둠.
            if(cnt == 7){ //정해진 암호 7개들어오면
                //System.out.println(temp);
                for(int j = 0; j<temp.length(); j++){
                    if(temp.charAt(j) == '#'){ //1  #일때만 변수 num에 2진수 -> 10진수 변환
                        num += Math.pow(2,6-j);
                    }
                }
                result += String.valueOf((char)num); // 다들어와서 10진수로 변환 완료하면 아스키코드로 변환
                //System.out.println((char)num);
                //변수 초기화
                num = 0;
                temp = "";
                cnt = 0;
            }
            if(i == str.length()) //무한루프 종료조건
                break;
            temp += str.charAt(i); //temp 변수에 암호화문자 넣기.
            cnt++;
            i++;
        }
        /*for(int i = 0; i<str.length(); i++){
            if(cnt == 7){
                System.out.println(temp);
                for(int j = 0; j<temp.length(); j++){
                    if(temp.charAt(j) == '#'){ //1
                        num += Math.pow(2,6-j);
                    }
                }
                result += String.valueOf((char)num); C
                System.out.println((char)num);
                num = 0;
                temp = "";
                cnt = 0;
            }
            temp += str.charAt(i);
            cnt++;

        }*/
        System.out.println(result);
    }
}
