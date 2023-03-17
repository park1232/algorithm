package org.example.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P11724_연결요소의개수구하기 {
    static boolean visited[];
    static ArrayList<Integer>[] A;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedReader의 경우는 빠른 입력을 위해서 사용합니다. 다만 readLine() 함수로 읽어오게 되면 한 줄씩 값을 읽어오게 됩니다.
        // 따라서 한줄에 데이터 값이 1개만 있는경우는 BufferedReader로 읽어서 형변환을 하여 사용하면 됩니다.
        // 하지만 어떤 문제에서는 입력이 한줄에 하나의 데이터가 아닌 공백을 주고 여러개의 데이터를 줄 때가 있습니다.
        //        해당 문제 역시 6 5 이런식으로 두개의 데이터가 한줄에 있는 형태입니다.
        // StringTokenizer는 공백단위로 데이터를 가공하여 줍니다.










        // StringTokenizer st = new StringTokenizer(br.readLine());
        // int n = Integer.parseInt(st.nextToken());
        // int m = Integer.parseInt(st.nextToken());

        // 1. br.readLine() 으로 한줄을 통채로 읽어옴 ( 6 5 )
        // 2. 이것을  StringTokenizer 에 저장 => 공백을 기준으로 가공하기 때문에 6과 5가 각각 저장됩니다.
        // 3. nextToken() 함수를 통하여 저장한 데이터 6, 5를 순차적으로 가져와 변수에 저장할 수 있습니다.

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        visited = new boolean[n + 1];
        A = new ArrayList[n+1];

        for(int i = 1; i < n + 1; i++) { // 인접 리스트 초기화하기
            A[i] = new ArrayList<Integer>();
        }

        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A[s].add(e); // 양방향 에지이므로 양쪽에 에지를 더하기
            A[e].add(s);
        }
        int count = 0;
        for(int i = 1; i < n + 1; i++) {
            if(!visited[i]) { // 방문하지 않은 노드가 없을 때까지 반복하기
                count++;
                DFS(i);
            }
        }
        System.out.println(count);
    }

    private static void DFS(int v) { // 재귀함수 형태
        if(visited[v]) {
            return;
        }
        visited[v] = true;
        for(int i : A[v]) {
            if(!visited[i]) { // 연결 노드 중 방문하지 않았던 노드만 탐색하기
                DFS(i);
            }
        }
    }
}
