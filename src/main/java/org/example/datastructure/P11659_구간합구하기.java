package org.example.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11659_구간합구하기 {
    public static void main(String[] args) throws IOException {
        // 구간 합 구하기
        // 데이터 개수가 많을땐 스캐너보단 버퍼리더
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // 데이터 수가 많으면 int보다 StringTokenizer를 사용(StringTokenizer는 수를 한줄로 쭉 받아올때 사용)
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()); // 버퍼리더 리드라인은 예제 첫번째 줄을 읽어왔다는 것

        int suNo = Integer.parseInt(stringTokenizer.nextToken());
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());

        // 합 배열 만들기
        long[] S = new long[suNo + 1]; // 0번째 인덱스를 무시하고 질의를 바로 받고자 배열에 +1을 한다

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i = 1; i <= suNo; i++) {
            S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        for(int q = 0; q <= quizNo; q++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(S[j] - S[i-1]);
        }

        // 합 배열 공식 S[i] = S[i-1] + A[i]
        // 구간 합 공식 S[j] - S[i-1]
    }
}
