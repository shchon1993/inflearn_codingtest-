package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class hash4 {
    public static void main(String[] args) throws IOException {
    //  bacaAacba
    //  abc
    //map2개 선언
    //문자열 사이즈만큼  반복문 돌면서 2번 map 개수만큼 짤라서 1번맵에 넣음
    //1,2번 맵 비교
    //반복


    //rt 선언 및 cnt 비교를 map2랑 해버렸음..문자열이랑 했었어야했는데 그래서 마지막 케이스 에러 발생.
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input1 = br.readLine();
    String input2 = br.readLine();
    HashMap<Character, Integer> map1 = new HashMap<>();
    HashMap<Character, Integer> map2 = new HashMap<>();
    for(char c : input2.toCharArray()){
        map2.put(c,map2.getOrDefault(c,0)+1);
    }
       // System.out.println(map2.size());
    int cnt = 0;
    boolean result_check = true;
    int result = 0;
    int lt = 0, rt = input2.length();
    while(true){
        if(rt == input1.length()+1){
            break;
        }
        if(cnt == input2.length()-1){
            for(int i = lt; i<rt;i++) {
                char c = input1.charAt(i);
                //System.out.print(c);
                map1.put(c, map1.getOrDefault(c, 0) + 1);
            }
            //System.out.println(" "+input2.length()+" "+map2.size()+" "+rt);
            for(char temp_c : map2.keySet()){
                if(map1.get(temp_c) != map2.get(temp_c)){
                    result_check = false;
                    break;
                }
            }

            if(result_check)
                result++;
            map1.clear();
            result_check = true;
            cnt = 0;
            lt++;
            rt++;
        }
        cnt++;

    }

    System.out.println(result);



    }
}
