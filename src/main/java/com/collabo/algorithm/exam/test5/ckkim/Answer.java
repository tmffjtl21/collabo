package com.collabo.algorithm.exam.test5.ckkim;

import java.util.HashMap;

/**
 * 문제5 풀이
 * @author changki kim
 */
public class Answer {

    /**
     * 풀이 함수
     */
    public int[] solve(int[] array, int target){
        if( array.length < 2 ){
            return null;
        }
        HashMap<Integer, Integer> temp = new HashMap<>();
        for(int i = 0; i < array.length; i++ ){
            int calc = target - array[i];
            if( temp.containsKey( calc ) ){
                return new int[] { temp.get( calc ) , i};
            }
            temp.put( array[i], i );
        }
        return null;
    }
}
