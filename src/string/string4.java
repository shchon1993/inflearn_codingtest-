package string;

import java.util.Scanner;

public class string4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();

        String arr[] = new String[cnt];
        String result[] = new String[cnt];
        for(int i = 0; i<cnt; i++){
            String temp = sc.next();
            arr[i] = temp;

        }

        for(int i = 0; i<cnt; i++){
            result[i] = "";
            for(int j = arr[i].length()-1; j>=0;j--){
                result[i] += arr[i].charAt(j);
            }


        }
        for(int i = 0; i<cnt; i++){
            System.out.println(result[i]);
        }

    }
}
