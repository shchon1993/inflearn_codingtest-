package twopointalgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;

public class twopointeralgo2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String strarr[] = str.split(" ");
        int arr1[] = new int[N];
        for(int i = 0; i<N; i++){
            arr1[i]= Integer.parseInt(strarr[i]);
        }

        int M = Integer.parseInt(br.readLine());
        str = br.readLine();
        strarr = str.split(" ");
        int arr2[] = new int[M];
        for(int i = 0; i<M; i++){
            arr2[i]= Integer.parseInt(strarr[i]);
        }

        Arrays.sort(arr1);
        //내림의 경우 int, double, char, float 사용 불가능
        // primitive Type을 Wrapper클래스로 박싱해주어야 reverseOrder 사용가능.
        //    Integer[] tmp = Arrays.stream(intArray).boxed().toArray(Integer[]::new);
        //    Arrays.sort(tmp, Comparator.reverseOrder()); // 내림차순
        Arrays.sort(arr2);

        int p1 = 0;
        int p2 = 0;
        LinkedList<Integer> list = new LinkedList<>();
        while(true){
            if(p1 == N || p2 == M)
                break;
            //System.out.println(p1 +" "+p2);
            if(arr1[p1]==arr2[p2]){
                list.add(arr1[p1]);
                p1++;
                p2++;
            }
            else if(arr1[p1]<arr2[p2]){
                p1++;
            }
            else if(arr1[p1]>arr2[p2]){
                p2++;
            }
        }

        for(int i =0 ;i<list.size();i++){
            System.out.print(list.get(i) + " ");
        }



    }
}
