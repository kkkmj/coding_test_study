package org.cote.sort;

import java.io.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

public class S5_11650 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++){
            StringTokenizer stk = new StringTokenizer(br.readLine(), " ");

            arr[i][0] = Integer.parseInt(stk.nextToken());
            arr[i][1] = Integer.parseInt(stk.nextToken());
        }

        Arrays.sort(arr, (i1, i2)-> i1[0]==i2[0]? i1[1]-i2[1]:i1[0]-i2[0]);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0; i < n; i++){
            bw.write(arr[i][0]+" "+arr[i][1]+"\n");
        }
        bw.flush();
    }
}
