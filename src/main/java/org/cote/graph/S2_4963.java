package org.cote.graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class S2_4963 {
    static int[] dx = {1, -1, 0, 0, 1, 1, -1, -1};
    static int[] dy = {0, 0, 1, -1, -1, 1, 1, -1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        StringTokenizer stk;
        int w;
        int h;
        boolean[][] visited;
        int[][] areas;


        while (true){
            stk = new StringTokenizer(br.readLine());
            int answer=0;
            w = Integer.parseInt(stk.nextToken());
            h = Integer.parseInt(stk.nextToken());
            if (w==0&&h==0){
                break;
            }


            areas = new int[h][w];
            visited = new boolean[h][w];
            for(int i = 0; i < h; i++){
                stk = new StringTokenizer(br.readLine());
                for (int j =0; j < w; j++) {
                    areas[i][j] = Integer.parseInt(stk.nextToken());
                    visited[i][j] = false;
                }
            }

            for(int i = 0; i < h; i++){
                for (int j =0; j < w; j++) {
                    if (areas[i][j] ==1 && !visited[i][j]){
                        visited[i][j] = true;
                        bfs(areas, i, j, h, w, visited);
                        answer+=1;
                    }
                }
            }
            System.out.println(answer);
        }
    }

    static void bfs(int[][] graph, int a, int b, int h, int w, boolean[][] visited){
        Queue<Integer[]> que;
        que = new LinkedList<>();
        que.offer(new Integer[]{a, b});

        while (!que.isEmpty()){
            Integer[] node =  que.poll();
            int x = node[0];
            int y = node[1];

            for(int i = 0; i < 8; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (-1<nx && nx < h && -1<ny && ny<w){
                    if (!visited[nx][ny] && graph[nx][ny]==1){
                        visited[nx][ny]=true;
                        que.offer(new Integer[]{nx, ny});
                    }
                }
            }
        }


    }


}
