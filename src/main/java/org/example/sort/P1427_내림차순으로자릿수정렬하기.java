package org.example.sort;

import java.util.Scanner;

public class P1427_내림차순으로자릿수정렬하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int A[] = new int[str.length()];

        for(int i = 0; i < str.length(); i++) {
            A[i] = Integer.parseInt(str.substring(i, i+1)); // 스캐너로 받은 str을 i부터 i+1까지 잘라출력
        }
        // 선택정렬
        for(int i = 0; i < str.length(); i++) {
            int Max = i;
            for(int j = i+1; j < str.length(); j++) { // 배열 인덱스에서 제일 높은 값을 찾아 Max에 그 인덱스 값을 담는 과정
                if(A[j] > A[Max]) {
                    Max = j;
                }
            }
            if(A[i] < A[Max]) { // 그 Max값을 A[i] 인덱스에 넣는 과정
                int temp = A[i];
                A[i] = A[Max];
                A[Max] = temp;
            }
        }
        for(int i = 0; i <str.length(); i++) {
            System.out.print(A[i]);
        }
    }
}
