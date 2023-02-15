package org.example.datastructure;

import java.util.Scanner;

public class P1546_평균구하기 {
    public static void main(String[] args) {
        // 평균구하기
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];

        for(int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        long sum = 0;
        long max = 0;

        for(int i = 0; i < N; i++) {
            if(A[i] > max) max = A[i];
            sum = sum + A[i];
        }

        System.out.println(sum * 100.0 / max / N);
        System.out.println(sum * 100.0 / max / N);
    }
}
