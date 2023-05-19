package org.cote.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class S4_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>(); //엥 그럼 자식 객체 = new 부모()아님?
        StringTokenizer stk;
        int back = -1;
        for (int i = 0; i < n; i++){
             stk = new StringTokenizer(br.readLine(), " ");
             String command = stk.nextToken();
             if (command.equals("push")) {
                 back = Integer.parseInt(stk.nextToken());
                 queue.offer(back);
             } else if (command.equals("pop")){
                 if (queue.isEmpty()){
                     System.out.println(-1);
                 }
                 else {
                     System.out.println(queue.poll());
                 }
             } else if (command.equals("size")){
                 System.out.println(queue.size());
             } else if (command.equals("empty")){
                 if (queue.isEmpty()){
                     System.out.println(1);
                 } else {
                     System.out.println(0);
                 }
             } else if (command.equals("front")) {
                 if (queue.isEmpty()){
                     System.out.println(-1);
                 } else {
                     System.out.println(queue.peek());
                 }
             } else if (command.equals("back")) {
                 if (queue.isEmpty()){
                     System.out.println(-1);
                 } else {
                     System.out.println(back);
                 }
             }
        }
    }
}
