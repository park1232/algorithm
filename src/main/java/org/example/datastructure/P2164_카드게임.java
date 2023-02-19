package org.example.datastructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P2164_카드게임 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> myQueue = new LinkedList<>();
        int N = sc.nextInt();
        for(int i = 1; i <= N; i++) {
            myQueue.add(i);
        }

        while (myQueue.size() > 1) {
            myQueue.poll(); // 버리는건 poll연산
            int temp = myQueue.poll();
            myQueue.add(temp); // 앞장에다 뽑은 카드 추가
        }
        System.out.println(myQueue.poll());
    }
}
