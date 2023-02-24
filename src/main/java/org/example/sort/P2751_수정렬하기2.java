package org.example.sort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class P2751_수정렬하기2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++) { // 리스트에 데이터 받아주기
            list.add(sc.nextInt());
        }

        Collections.sort(list); // 리스트 정렬

        for(Integer i : list) { // 정렬한 데이터를 문자열에 넣어줌
            sb.append(i).append("\n");
        }

        System.out.println(sb);
    }
}
