package org.cote.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class S2_12891 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        char[] DNA = {'A', 'C', 'G', 'T'};
        int[] essential = new int[4];

        int S = Integer.parseInt(stk.nextToken());
        int P = Integer.parseInt(stk.nextToken());

        String dnaString = br.readLine();
        stk = new StringTokenizer(br.readLine());
        for(int i = 0 ; i < 4; i++){
            essential[i] = Integer.parseInt(stk.nextToken());
        }
        int answer = 0;

        Map<Character, Integer> dnaDictionary = new HashMap<>();
        dnaDictionary.put('A', 0);
        dnaDictionary.put('C', 0);
        dnaDictionary.put('G', 0);
        dnaDictionary.put('T', 0);

        for (int i = 0 ; i <P; i++){
            char dnaC = dnaString.charAt(i);
            dnaDictionary.put(dnaC, dnaDictionary.get(dnaC)+1);
        }
        boolean flag = true;
        for (int i = 0; i < 4; i++){
            if(dnaDictionary.get(DNA[i])<essential[i]){
                flag = false;
                break;
            }
        }
        if(flag) answer+=1;

        for(int i = P; i <S; i++){
            char dnaB = dnaString.charAt(i-P);
            char dnaN = dnaString.charAt(i);

            dnaDictionary.put(dnaN, dnaDictionary.get(dnaN)+1);
            dnaDictionary.put(dnaB, dnaDictionary.get(dnaB)-1);

            flag = true;
            for (int k = 0; k < 4; k++){
                if(dnaDictionary.get(DNA[k])<essential[k]){
                    flag = false;
                    break;
                }
            }
            if(flag) answer+=1;

        }

        System.out.println(answer);




    }
}
