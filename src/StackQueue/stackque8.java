package StackQueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class stackque8 {
    public static void main(String[] args) throws IOException {
        LinkedList<Point> list = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input[] = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        input = br.readLine().split(" ");

        for(int i = 0; i<N; i++){
            //System.out.println(input[i]);
            list.add(new Point(i,Integer.parseInt(input[i])));
        }

        int cnt = 0;


        Point p1;
        Point p2;
        boolean check = false;
        boolean finish = false;
        while(true){
            p1 = (Point)list.get(0);
            for(int i = 1; i<list.size(); i++){
                p2 = (Point)list.get(i);
                if(p1.y<p2.y){
                    list.removeFirst();
                    list.addLast(new Point(p1.x,p1.y));
                    check = true;
                    break;
                }
            }
            if(!check){
                cnt++;
                p2 = (Point)list.removeFirst();
                if(p2.x == M)
                    finish = true;
            }
            if(finish)
                break;

            check = false;
        }

        System.out.println(cnt);

    }
    static class Point{
        int x;
        int y;
        public Point(int x, int y){
            this.x = x;
            this.y = y;
        }

    }


}
