package com.collabo.algorithm.exam.test11.tjlee;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//4 3
// 4 2 3 1 5 6 7 8 9 10
// output : 2

public class Answer {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int arraySize = Integer.parseInt(input.split(" ")[0]);
        int chooseSize = Integer.parseInt(input.split(" ")[1]);
        String input2 = br.readLine();
        String[] strArray = input2.split(" ");
        int[] array = new int[arraySize];
        for (int i = 0; i<strArray.length; i++) {
            array[i] = Integer.parseInt(strArray[i]);
        }
        int count = 1;
        while (arraySize > chooseSize){
            arraySize = arraySize - chooseSize + 1;
            count++;
        }
        System.out.println(count);
    }
}
