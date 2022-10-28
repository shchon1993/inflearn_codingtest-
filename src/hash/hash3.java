package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class hash3 {
    public static void main(String[] args) throws IOException {
        HashMap<Integer, Integer> map = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        String strarr[] = str1.split(" ");
        int N = Integer.parseInt(strarr[0]);
        int K = Integer.parseInt(strarr[1]);
        strarr = str2.split(" ");
        int arr[] = new int[N];
        for(int i = 0; i<N; i++){
            arr[i] = Integer.parseInt(strarr[i]);
        }
    // map1.put(c,map1.getOrDefault(c,0)+1);
        for(int i = 0; i<K; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int idx = 0;

        //결과값 출력할때 단순 String으로 하니깐 시간 초과남. StringBuilder객체를 선언해서 시간을 세이브하자.
        StringBuilder result = new StringBuilder();
        result.append(map.size()+" ");
                String.valueOf(map.size()+" ");
        for(int i = K; i<N; i++){
            map.put(arr[idx], map.get(arr[idx])-1);
            if(map.get(arr[idx]).equals(0)){
                map.remove(arr[idx]);
            }
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            result.append(map.size()+" ");
            idx++;
        }
        System.out.println(result);
    }
}
