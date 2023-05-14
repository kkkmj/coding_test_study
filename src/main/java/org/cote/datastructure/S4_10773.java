package org.cote.datastructure;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class S4_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        int k = Integer.parseInt(br.readLine());

        for(int i = 0; i < k; i++){
            int n = Integer.parseInt(br.readLine());
            if(n!=0) {
                stack.push(n);
            }
            else{
                stack.pop();
            }
        }
        int sum = 0;
        while(!stack.empty()){
            sum+=stack.pop();
        }
        System.out.println(sum);

    }
}

/*
걍 stack 안쓰고 리스트로 똑같이 구현해줄 수 있음
 */
