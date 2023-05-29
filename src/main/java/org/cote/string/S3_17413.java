package org.cote.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S3_17413{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        StringBuilder sb = new StringBuilder();

        boolean flag;
        flag = true;
        StringBuilder temp = new StringBuilder();

        for(int i = 0; i < S.length(); i++){
            if(flag && (S.charAt(i)==' '||S.charAt(i)=='<')){
                sb.append(temp.reverse());
                if (S.charAt(i)==' ') sb.append(' ');
                temp.setLength(0);
            }
            else if(flag){
                temp.append(S.charAt(i));
            }
            if (S.charAt(i)=='<'){
                flag = false;
            }
            if (!flag){
                sb.append(S.charAt(i));
            }
            if (S.charAt(i)=='>' ){
                flag = true;
            }
        }
        if (temp.length()!=0){
            sb.append(temp.reverse());
        }

        System.out.println(sb.toString());
    }
}
