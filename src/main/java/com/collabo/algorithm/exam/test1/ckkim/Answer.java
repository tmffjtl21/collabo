package com.collabo.algorithm.exam.test1.ckkim;

/**
 * 문제1 풀이
 * @author changki kim
 */
public class Answer {

    /**
     * 풀이 함수
     * @param array
     * @return
     */
    public int solve(int[] array){
        int maxSum = array[0];
        int currentSum = array[0];
        for(int i = 1; i < array.length; i++){
            currentSum = Math.max( currentSum + array[i] , array[i] );
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }
}
