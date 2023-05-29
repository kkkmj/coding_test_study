package org.cote.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class S2_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stk = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stk.nextToken());
        int m = Integer.parseInt(stk.nextToken());

        HashSet<String> noListens = new HashSet<String>();
        ArrayList<String> noLookListens = new ArrayList<>();
        for (int i = 0; i < n; i++){
            noListens.add(br.readLine());
        }
        for (int j = 0; j < m; j++){
            String noLook = br.readLine();
            if (noListens.contains(noLook)){
                noLookListens.add(noLook);
            }
        }
        Collections.sort(noLookListens);

        System.out.println(noLookListens.size());
        for (String answer : noLookListens){
            System.out.println(answer);
        }
    }
}

/*
HashSet과 ArrayList를 공부할 수 있었던 문제!

HashSet은 해시 자료구조로 중복 여부를 O(1)로 빠르게 알 수 있고
ArrayList는 배열의 크기를 모르지만 인덱스로 쉽게 접근 가능한 List임!
 */

/*
걍 이렇게 할 필요없이 모든 수 하나에 받은 다음
sort때려서 for문으로 인덱스 그 전꺼랑 똑같다면 cnt+1해주면 됨
 */