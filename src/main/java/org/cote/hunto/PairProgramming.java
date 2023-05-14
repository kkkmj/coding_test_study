package org.cote.hunto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PairProgramming {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());

        int[] performances = new int[n];
        stk = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i<n; i++){
            performances[i] = Integer.parseInt(stk.nextToken());
        }

        int pair = 0;
        int start = 0;
        int end = n-1;

        while(start<end){
            if(performances[start]+performances[end]>=m){
                pair+=1;
            }
            end-=1;
            start+=1;
        }

        System.out.println(pair);
    }
}
