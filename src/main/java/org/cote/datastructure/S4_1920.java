package org.cote.datastructure;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S4_1920 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk;
        int n = Integer.parseInt(br.readLine());
        int[] arr1 = new int[n];
        stk = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++){
            arr1[i] = Integer.parseInt(stk.nextToken());
        }
        Arrays.sort(arr1);

        int m = Integer.parseInt(br.readLine());
        StringBuilder answers = new StringBuilder();
        stk = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < m; i++){
            answers.append(findNumber(arr1, Integer.parseInt(stk.nextToken()))+"\n");
            }
        System.out.println(answers.toString());
        }

    static int findNumber(int[] arr, int num){
        int end = arr.length-1;
        int start = 0;
        int mid = (end+start)/2;


        while (start<=end){
            if (arr[mid]==num){
                return 1;
            } else if(arr[mid]<num) {
                start = mid + 1;
            }else {
                end = mid-1;
            }
            mid = (start+end)/2;
        }
        return 0;
    }
}
