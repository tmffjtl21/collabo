package com.collabo.algorithm.exam.test2.ckkim;

/**
 * 문제2 풀이
 * @author changki kim
 */
public class Answer {

    /**
     * 풀이 함수
     * @param number number
     * @return sum
     */
    public int solve(final int number){
        int before = 0;
        int current = 1;
        int next;
        int sum = 0;
        while( ( next = before + current ) < number ){
            if( next % 2 == 0 ){
                sum += next;
            }
            before = current;
            current = next;
        }
        return sum;
    }
}
