package org.cote.hunto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Container {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] words = new String[n];

        int minLen = 100000;
        for(int i = 0; i < n; i++){
            words[i] = br.readLine();
            if(words[i].length()<minLen) minLen = words[i].length();
        }

        //Arrays.sort(words, Comparator.comparing(String::length));

        for (int i = 0 ; i < n; i++){
            String word = words[i];
            boolean flag = false;
            if (word.length()<minLen*2){
                System.out.println("No");
                continue;
            }
            else {
                loop:
                for (int j = 0; j < n; j++){
                    for (int k = j; k < n; k++){
                        if (words[j].length()+words[k].length()==word.length()){
                            String temp = word.substring(1, word.length()-1);
                            if (words[j].equals(word.charAt(0)+temp.replace(words[k],"")+word.charAt(word.length()-1))){
                                flag = true;
                                break loop;
                            }
                            if (words[k].equals(word.charAt(0)+temp.replace(words[j], "")+word.charAt(word.length()-1))){
                                flag = true;
                                break loop;
                            }
                        }
                    }
                }
            }
            if(flag){
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }

        }


    }

}
