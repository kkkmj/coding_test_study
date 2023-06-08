package org.cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S4_1244 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer stk = new StringTokenizer(br.readLine());
        int[] switches = new int[n];
        for (int i = 0; i < n; i++){
            switches[i] = Integer.parseInt(stk.nextToken());
        }

        int studentNum = Integer.parseInt(br.readLine());



    }
}
