package org.cote.math;
import java.util.Scanner;

public class ZOAC4_B4_23971 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();

        int x;
        int y;
        x = w/(m+1);
        y = h/(n+1);

        if(w%(m+1)!=0){
            x+=1;
        }
        if(h%(n+1)!=0){
            y+=1;
        }
        System.out.println(x*y);

    }

}

/*
어떡하지 자바 너무 어렵고 싫다 으아아ㅏ아아아아아아아ㅏㅏㄱㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ
사실상 수학같은 문제들은 자바나 파이썬이나 딱히 상관 없긴함
그냥 언어적으로 어떻게 차이가 나냐... 이런게 문제지 진짜 이런문제도 그런거보면..심각하긴한듯
가끔 시간 안날때나 아니면 조금씩 쉬운 문제들 빠르게 풀고 싶을때
파이썬으로 빠르게 풀고 그다음 자바로 다시 푸는식으로 해야겠다..ㅠ
* */