package twopointalgo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class twopointeralgo1 {
    public static void main(String[] args) throws IOException {
        //시간복잡도가 O(n)이 되도록 문제를 해결
        //이미 정렬된 배열이기 때문에
        //각각에 인덱스를 가장 큰 배열인 n번길이만큼 비교하면서 그대로 값 넣기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String str_arr[] = str.split(" ");
        int arr1[] = new int[N];
        for(int i =0 ;i<N; i++){
            arr1[i] = Integer.parseInt(str_arr[i]);
        }

        int M = Integer.parseInt(br.readLine());
        str = br.readLine();
        String str_arr2[] = str.split(" ");
        int arr2[] = new int[M];
        for(int i =0 ;i<M; i++){
            arr2[i] = Integer.parseInt(str_arr2[i]);
        }

        int p1 = 0, p2 = 0;
        LinkedList<Integer> list = new LinkedList<>();
        while(true){
            if(p1 == N){
                for(int i = p2; i<M;i++){
                    list.add(arr2[i]);
                }
                break;
            }
            else if(p2 == M){
                for(int i = p1; i<N;i++){
                    list.add(arr1[i]);
                }
                break;
            }
            if(arr1[p1]<arr2[p2]){
                list.add(arr1[p1]);
                p1++;
            }
            else{
                list.add(arr2[p2]);
                p2++;
            }

        }

        for(int i = 0; i<list.size();i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();



    }
}
