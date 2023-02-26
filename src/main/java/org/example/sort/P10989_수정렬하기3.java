package org.example.sort;

import java.io.*;

public class P10989_수정렬하기3 {
    public static void main(String[] args) throws IOException {
        // 계수정렬
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] count = new int[10001];

        for(int i = 0; i < N; i++) {
            int number = Integer.parseInt(br.readLine());
            count[number]++;
        }
        br.close();

        for(int i = 0; i < 10000; i++) {
            if(count[i] != 0) {
                for(int j = 0; j < count[i]; j++) {
                    bw.write(i + "\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
