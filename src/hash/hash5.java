package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class hash5 {
    public static void main(String[] args) throws IOException {
        //맵으로 다 입력받음. 값이 있으면 +1
        //키만 꺼내서 어레이 리스트에 넣은 후 정렬
        //k번째 값 찾기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input1 = br.readLine();
        String input2 = br.readLine();

        String[] inputarr1 = input1.split(" ");
        String[] inputarr2 = input2.split(" ");
        int N = Integer.parseInt(inputarr1[0]);
        int K = Integer.parseInt(inputarr2[1]);

        int arr[] = new int[N];

        for(int i = 0; i<N; i++){
            arr[i] = Integer.parseInt(inputarr2[i]);
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        ArrayList<Integer> list = new ArrayList<>();

        for(int num : map.keySet()){
            list.add(num);
        }

        Collections.sort(list);

        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }


    }
}
