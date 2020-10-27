package com.collabo.algorithm.exam.test6.tjlee;

import java.util.Arrays;

// 정수 배열(int array)이 주어지면 두번째로 큰 값을 프린트하시오.
// input
//예제)
//        Input: [10, 5, 4, 3, -1]
//        Output: 5
public class Answer {
    public static void main(String[] args) {
        int[] array = {10, 4, 5, 3, -1};
//        int[] array = {3, 3, 3};
        Arrays.sort(array);

        String answer = "Does not exist.";
        for(int i = array.length-1; i >= 0; i--){
            if(array[i] < array[array.length-1]){
                answer = array[i] + "";
                break;
            }
        }
        System.out.println(answer);
    }
}
