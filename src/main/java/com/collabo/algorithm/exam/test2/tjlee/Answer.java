package com.collabo.algorithm.exam.test2.tjlee;

import java.util.ArrayList;
import java.util.List;

//Input: N = 12
//Output: 10 // 0, 1, 2, 3, 5, 8 중 짝수인 2 + 8 = 10.
public class Answer {
    public static void main(String[] args) {
        System.out.println(solve(500));
    }

    private static Integer solve(Integer n) {
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);

        while (list.get(list.size()-1) + list.get(list.size()-2) <= n){
            list.add(list.get(list.size()-1) + list.get(list.size()-2));
        }
        Integer result = 0;
        int count = 0;
        for(int i= list.size()-1; i>0; i--){

            if(count == 2) break;
            if(list.get(i) % 2 == 0){
                System.out.println(list.get(i));
                result += list.get(i);
                count += 1;
            }
        }

        return result;
    }
}
