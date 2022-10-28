package hash;

import java.util.HashMap;
import java.util.Scanner;

public class hash2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        boolean result = true;

        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();

        for(char c : str1.toCharArray()){ //문자열을 char 배열로 변경하여 넣음.
            map1.put(c,map1.getOrDefault(c,0)+1); //getOrDefault는 key값이 map에 없으면 0으로 value값 넣음. 아니면 +1
        }
        for(char c : str2.toCharArray()){ //문자열을 char 배열로 변경하여 넣음.
            map2.put(c,map2.getOrDefault(c,0)+1); //getOrDefault는 key값이 map에 없으면 0으로 value값 넣음. 아니면 +1
        }

        for(char c : map1.keySet()){
            if(!map1.get(c).equals(map2.get(c))) {
                result = false;
                break;
            }
        }
        System.out.println(result);





    }
}
