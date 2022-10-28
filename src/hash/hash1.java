package hash;

import java.util.HashMap;
import java.util.Scanner;

public class hash1 {
    public static void main(String[] args) {
        HashMap<Character,Integer> map = new HashMap<>();
        /*map.put('A',0);
        map.put('B',0);
        map.put('C',0);
        map.put('D',0);
        map.put('E',0);*/
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        String str = sc.next();
        for(char c : str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(int i = 0; i<str.length();i++){
            char c = str.charAt(i);
            int temp = map.get(c);
            temp++;

            map.put(c,temp);
        }

        int MAX = 0;
        char result = ' ';
        for(char c : map.keySet()){
           
            if(MAX<map.get(c)){
                MAX = map.get(c);
                result = c;
            }

        }
        System.out.println(result);
      


    }
}
