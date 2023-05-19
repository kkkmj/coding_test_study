package org.cote.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class S4_10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        StringTokenizer stk;
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){
            stk = new StringTokenizer(br.readLine(), " ");
            String command = stk.nextToken();
            if (command.equals("push")){
                stack.push(Integer.parseInt(stk.nextToken()));
            } else if (command.equals("pop")) {
                if(stack.empty()){
                    System.out.println(-1);
                }
                else {
                    System.out.println(stack.pop());
                }
            } else if (command.equals("size")) {
                System.out.println(stack.size());                
            } else if (command.equals("empty")) {
                if(stack.empty()){
                    System.out.println(1);
                }else {
                    System.out.println(0);
                }
            }else if (command.equals("top")){
                if(stack.empty()){
                    System.out.println(-1);
                }else {
                    System.out.println(stack.peek());
                }
            }
        }

    }

}
