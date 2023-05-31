package org.cote.hunto;

import java.io.InputStreamReader;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;

public class PaintCar {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());
        int[] cars = new int[n+1];
        cars[0] = 0;
        stk = new StringTokenizer(br.readLine());
        for(int i = 1; i<n+1; i++){
            cars[i] = Integer.parseInt(stk.nextToken());
        }

        int[] total_car = new int[n+1];
        for(int i = 1; i<n+1; i++){
            total_car[i]=total_car[i-1]+cars[i];
        }

        for(int i=0; i<m; i++){
            stk = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(stk.nextToken());
            int t = Integer.parseInt(stk.nextToken());

            int total = total_car[t]-total_car[s-1];
            System.out.println(total);
        }


    }
}
