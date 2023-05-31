package org.cote.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class S5_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] words = new String[n];
        for (int i = 0; i < n; i++){
            words[i] = br.readLine();
        }

        HashSet<String> hashSet = new HashSet<>(Arrays.asList(words));
        words = hashSet.toArray(new String[0]);



        //Arrays.sort(words, (String a, String b) -> a.length()-b.length());
        Arrays.sort(words);
        Arrays.sort(words, Comparator.comparing(String::length));


        for (String word : words){
            System.out.println(word);
        }

    }
}
