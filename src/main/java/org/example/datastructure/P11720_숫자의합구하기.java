package org.example.datastructure;

import java.util.Scanner;

public class P11720_숫자의합구하기 {
    public static void main(String[] args) {
        //숫자의 합 구하기
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();
        int sum = 0;

        for(int i=0; i < cNum.length; i++) {
            // 문자열을 숫자형으로 바꿔줄때는 문자열 0을 마이너스로 해주면 되거나, -48을 해주면 됨 (아스키코드)
            sum += cNum[i] - '0';
        }
        System.out.println(sum);
    }
}
