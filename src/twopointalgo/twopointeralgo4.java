package twopointalgo;

import java.util.Scanner;

public class twopointeralgo4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String NMarr[] = sc.nextLine().split(" ");
        String strarr[] = sc.nextLine().split(" ");

        int N = Integer.parseInt(NMarr[0]);
        int M = Integer.parseInt(NMarr[1]);
        int arr[] = new int[N];
        for(int i =0 ; i<strarr.length;i++){
            arr[i] = Integer.parseInt(strarr[i]);
        }
        int result = 0;

        for(int i = 0; i<N; i++){
            int num_result = 0;
            for(int j = i; j<N; j++){
                num_result += arr[j];
                if(num_result > M)
                    break;
                else if(num_result == M){
                    result++;
                }

            }
        }
        System.out.println(result);
    }


}
