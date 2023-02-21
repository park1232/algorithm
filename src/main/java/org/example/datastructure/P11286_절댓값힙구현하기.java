package org.example.datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class P11286_절댓값힙구현하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 우선순위 큐
        PriorityQueue<Integer> MyQueue = new PriorityQueue<>((o1, o2) -> { // 비교할 객체 두개 선언

            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);

            if(first_abs == second_abs) {   // 절댓값이 같은 경우 음수 우선
                return o1 > o2 ? 1 : -1;
            }
            return first_abs - second_abs; // 절댓값 작은 데이터 우선
        });

        for(int i = 0; i < N; i++) {
            int request = Integer.parseInt(br.readLine());
            if(request == 0) {
                if(MyQueue.isEmpty()) {
                    System.out.println("0");
                } else {
                    System.out.println(MyQueue.poll());
                }
            } else {
                MyQueue.add(request);
            }
        }
    }
}
