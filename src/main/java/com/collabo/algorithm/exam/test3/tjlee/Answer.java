package com.collabo.algorithm.exam.test3.tjlee;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Answer {
    public static void main(String[] args) {
        System.out.println(input(3));
    }

    private static String input(int s) {

        List<String> stringList = new ArrayList<>();
        for(int i =0; i<s; i++){
            stringList.add("(");
            stringList.add(")");
        }

        Set<String> output = new HashSet<>();

        int n = stringList.size();
        int r = stringList.size();
        doCombination(stringList, n, r, 0, 0, output);

        Set<String> output2 = new HashSet<>();
        for (String s1 : output) {
            if(verification(s1)){
                output2.add(s1);
            }
        }
        return output2.toString();
    }

    public static void doCombination(List<String> stringList, int n, int r, int index, int target, Set<String> output){

        if(r == 0 || target == n){
        }else{
            doCombination(stringList, n, r-1, index+1, target+1, output);
            doCombination(stringList, n, r, index, target+1, output);
        }
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
