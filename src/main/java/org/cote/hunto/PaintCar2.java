package org.cote.hunto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class PaintCar2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());

        int[] totalCar = new int[n];
        stk = new StringTokenizer(br.readLine());

        totalCar[0] = Integer.parseInt(stk.nextToken());
        for (int i = 1; i < n; i++){
            totalCar[i] = totalCar[i-1] + Integer.parseInt(stk.nextToken());
        }

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < m; i++){
            stk = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(stk.nextToken())-1;
            int t = Integer.parseInt(stk.nextToken())-1;
            int sum = totalCar[t];

            if (s>0){
                sum -= totalCar[s-1];
            }
            answer.append(sum).append("\n");
        }
        System.out.println(answer);


    }
}
