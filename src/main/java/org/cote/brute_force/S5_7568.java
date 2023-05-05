package org.cote.brute_force;

import java.util.Scanner;
public class S5_7568 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] info = new int[n][2];
        int[] rank = new int[n];

        for(int i = 0; i<n; i++){
            info[i][0]=sc.nextInt();
            info[i][1]=sc.nextInt();
        }

        for(int i=0; i<n; i++){
            rank[i]=1;
            for(int j = 0; j<n; j++){
                if (info[i][0]<info[j][0] && info[i][1]<info[j][1]){
                    rank[i]+=1;
                }
            }
        }

        for(int i = 0; i< n; i++){
            System.out.print(rank[i]+" ");
        }


    }
}
