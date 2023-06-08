package org.cote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;
import java.util.StringTokenizer;

public class Try {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int[] nums = new int[3];
            StringTokenizer stk = new StringTokenizer(br.readLine(), " ");
            nums[0] = Integer.parseInt(stk.nextToken());
            nums[1] = Integer.parseInt(stk.nextToken());
            nums[2] = Integer.parseInt(stk.nextToken());

            Arrays.sort(nums);
            if (nums[2]==0) break;

            if (Math.pow(nums[0], 2) + Math.pow(nums[1], 2) == Math.pow(nums[2], 2)){
                System.out.println("right");
            }
            else {
                System.out.println("wrong");
            }

        }
    }
}
