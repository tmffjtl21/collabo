package com.collabo.algorithm.exam.test8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Answer {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        // 난이도의 문제 받기
        int[] array = new int[N];
        String str = br.readLine();
        String[] split = str.split(" ");
        for(int i = 0; i < N; ++i){
            array[i] = Integer.parseInt(split[i]);
        }

        Arrays.sort(array);

        int[] answer = new int[3];

        for(int i = 0; i<array.length; i++){
            if(i == 0) answer[i] = array[i];

            if(answer[1] == 0 && answer[0]<array[i] ){
                answer[1] = array[i];
            }

            if(answer[1] != 0 && answer[2] == 0 && answer[1]<array[i] ){
                answer[2] = array[i];
            }
        }

        for (int i : answer) {
            System.out.print(i);
        }


        if(answer[2] == 0)
            System.out.print("NO");
        else
            System.out.print("YES");

        br.close();
    }
}
