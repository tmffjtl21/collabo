package com.collabo.algorithm.exam.test10.tjlee;

public class Answer {

    public static void main(String[] args) {
        System.out.println(solution(6000, 11));
    }

    private static String solution(int a, int b) {

        StringBuilder stringBuilder = new StringBuilder();

        while(true){
            int c = a%b;
            stringBuilder.append(getOverNumber(c));
            a = a/b;
            if(a<b) {
                if(a != 0){
                    stringBuilder.append(getOverNumber(a));
                }
                break;
            }
        }
        return stringBuilder.reverse().toString();
    }

    private static String getOverNumber(int k) {
        String num = "ABCDEF";
        if(k >= 10){
            return String.valueOf(num.charAt(k - 10));
        }else{
            return String.valueOf(k);
        }
    }
}
