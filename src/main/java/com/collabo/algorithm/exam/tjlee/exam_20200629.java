package com.collabo.algorithm.exam.tjlee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class exam_20200629 {
    public static void main(String[] args) {

        Integer[] ints = {2, 5, 6, 1, 10};
        Integer[] result = sort(ints);
        int target = 8;

        System.out.println(Arrays.toString(calcurate(result, target)));
    }

    private static Integer[] calcurate(Integer[] inputs, int target) {

        List<Integer> output = new ArrayList<>();

        int start = 0;
        int end = inputs.length - 1;

        while (output.size() != 2) {
            if (inputs[start] + inputs[end] == target) {
                output.add(start);
                output.add(end);
                break;
            } else if (inputs[start] + inputs[end] > target) {
                end = end - 1;
            } else {
                start = start + 1;
            }
        }

        return output.toArray(new Integer[output.size()]);
    }

    public static Integer[] sort(Integer[] a) {
        List<Integer> list = Arrays.asList(a);
        int min = Collections.min(list);
        int max = Collections.max(list);
        Integer[] aux = new Integer[a.length];
        Integer[] c = new Integer[max - min + 1];
        Arrays.fill(c, 0);

        for (int i = 0; i < a.length; i++) {
            c[a[i] - min] += 1;
        }

        for (int i = 1; i < c.length; i++) {
            c[i] += c[i - 1];
        }

        for (int i = a.length - 1; i >= 0; i--) {
            aux[--c[a[i] - min]] = a[i];
        }

        return aux;
    }
}
