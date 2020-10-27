package com.collabo.algorithm.exam.test7.tjlee;

import java.util.Iterator;

public class iterator {

    public static void main(String[] args) {
        int[] array = {10, 4, 5, 3, -1};

        Iterable<Integer> aIterable= () -> new Iterator<Integer>() {
            private int pos=0;

            public boolean hasNext() {
                return array.length>pos;
            }

            public Integer next() {
                return array[pos++];
            }

            public void remove() {
                throw new UnsupportedOperationException("Cannot remove an element of an array.");
            }
        };

        Iterator iterator = aIterable.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
