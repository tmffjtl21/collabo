package com.collabo.algorithm.exam.test3.tjlee;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Answer {
    public static void main(String[] args) {
        System.out.println(input(2));
    }

    private static String input(int s) {

        List<String> stringList = new ArrayList<>();
        for(int i =0; i<s; i++){
            stringList.add("(");
            stringList.add(")");
        }

        List<String> output = new ArrayList<>();

        permutation(stringList, output,0, stringList.size(), stringList.size());

        Set<String> output2 = new HashSet<>();
        for (String s1 : output) {
            if(verification(s1)){
                output2.add(s1);
            }
        }
        return output2.toString();
    }

    static List<String> permutation(List<String> input, List<String> output,  int depth, int n, int r) {
        if (depth == r) {
            return output;
        }
        for (int i=depth; i<n; i++) {
            swap(input, depth, i);
            output.add(input.toString());
            permutation(input, output,depth + 1, n, r);
            swap(input, depth, i);
        }
        return null;
    }

    static void swap(List<String> arr, int depth, int i) {
        String temp = arr.get(depth);
        arr.set(depth, arr.get(i));
        arr.set(i, temp);
    }

    private static Boolean verification(String val){

        char[] chars = val.toCharArray();
        int open = 0;
        int close = 0;
        for(int i =0; i < chars.length; i++){
            if( chars[i] == '(' ) open++;
            if( chars[i] == ')' ) close++;
            if(close > open) return Boolean.FALSE;
        }
        for(int i = chars.length -1; 0 <= i; i--){
            if( chars[i] == '(' ) open++;
            if( chars[i] == ')' ) close++;
            if(close < open) return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }
}
