/*
N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 */
package org.cote.sort;

import java.io.*;
import java.util.Arrays;
import java.util.PriorityQueue;


public class S5_2751 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for(int i=0; i<n; i++){
            priorityQueue.add(Integer.parseInt(br.readLine()));
        }
        while(!priorityQueue.isEmpty()){
            bw.write(priorityQueue.poll()+"\n");
        }
        bw.flush();
    }
}

/*
일단 system.out.println()은 시간 면에서 차이가 심함.+bw도 그냥 어차피 뒤에 "" 해주면 문자열 취급되니까
"\n" 해주면 됨

자바의 priorityQueue는 우선순위큐+최소힙/최대힙 둘다 가능이기 때문에 우선순위큐로 최소힙 정렬해서 구현해줄 수 있음

+로 이건 걍 Collection.sort() 가 정배? 인 문제
Arrays.sort()의 효율성과 system.out.println()의 효율성을 알아보라는 문제인듯.

암튼 가장 빠르게 푸는 방법은 중복되는 수가 없기 때문에 boolean 배열을 만들어서
배열의 값이 아닌, 인덱스를 통해 수의 유무로 출력을 해줄 수 있다. 미친듯ㄷㄷㄷ
즉, n의 범위만큼 boolean배열을 만들어 두고, boolean[받은값]=1로 만들어 버리면 되는 것!
그럼 굳이 뭐 정렬할 필요 없이 for문 돌려서 if boolean[]=true로 해서 true인 인덱스값만 출력해주면된다 ㄷㄷ
 */