package twopointalgo;

import java.util.Scanner;

public class twopointeralgo5 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int mid = 0;
        int result = 0;

        if (N % 2 != 0) {
            mid = N/2 + 1;
        }
        else  mid = N/2;

        for(int i = 1; i<=mid; i++){
            int num_result = 0;
            for(int j = i; j<= mid; j++){
                num_result+=j;
                if(num_result>N)
                    break;
                else if(num_result == N)
                    result++;
            }
        }

        System.out.println(result);

    }
}
