package org.cote.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S5_1010 {
    static int[][] combis = new int[30][30];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer stk = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(stk.nextToken());
            int n = Integer.parseInt(stk.nextToken());
            System.out.println(combination(n, r));


        }
    }
    static int combination(int n, int r){
        if (combis[n][r] != 0) return combis[n][r];
        if (n==r || r == 0) return 1;
        else{
            combis[n][r] = combination(n-1, r-1) + combination(n-1, r);
            return combis[n][r];
        }


    }
}

/**
 * 어렵다 어려워...
 * 조합론 생각해야 됐던 문제...
 * 정확히 말하면 조합론 + dp
 *
 * 조합이 nCr = n-1Cr-1 +  n-1Cr 인걸 안 상태에서
 * 계속 반복해준 값 구하는 느낌쓰 2차원 배열로 이렇게 푸는 것도 좀 참신했음.
 * 사실 구현 자체는 안어려운데 걍 2차원 배열 + dp + 재귀 를 동시에 사용한다는 생각 자체를 하는게 좀 어려웠던 듯..ㅠㅠ
 * 걍 뭐야 피보나치랑 사실 다를게 없음 점화식이 이미 나와있던 상태였기  땜시...
 * 항상 생각하자...
 * dp = 점화식이다. 점화식을 구하면 dp는 그대로 구현만 하면 된다!
 * 조합의 점화식은 nCr = n-1Cr-1 +n-1Cr 이기 때문에 계속 재귀 재귀 해서 구해준거 return해주면 된다!
 */