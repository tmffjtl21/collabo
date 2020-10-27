package com.collabo.algorithm.exam.test9.tjlee;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Answer {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int N = Integer.parseInt(input.split(" ")[0]);
        int K = Integer.parseInt(input.split(" ")[1]);

        int[] cards = new int[N];
        for (int i = 0; i < cards.length; i++) {
            cards[i] = i;
        }

        List<int[]> list = new ArrayList<>();
        reCombination(cards, N, K, 0, 0, list);
        System.out.println(list.size());
        int result = 0;

        for (int[] ints : list) {
            int sum = 0;
            for (int i : ints) {
                sum += i;
            }
            if(sum == N) result +=1;
        }

        System.out.println(result);
    }

    private static void reCombination(int[] comArr, int n, int r, int index, int target, List<int[]> list) {
        if(r==0){
            list.add(comArr);
            return;
        }
        if(target == n)return;
        reCombination(comArr, n, r-1, index+1, target+1, list);
        reCombination(comArr, n, r, index, target+1, list);
    }
}
