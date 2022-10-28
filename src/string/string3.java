package string;

import java.util.Scanner;

public class string3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String arr[] = str.split(" ");



        //Integer.MIN_VALUE;
        //Integer.MAX_VALUE;
        int com = 0;
        String result = arr[com];

        for(int i = 1; i<arr.length;i++){
            if(arr[com].length() < arr[i].length()){
                com = i;
                result = arr[i];
            }
        }

        System.out.println(result);
    }
}
