package com.collabo.algorithm.exam.test12.tjlee;

public class Answer {

    private static int value = 4;
    private static int[] base = new int[value + 1];

    private static int base_one = 0;
    private static int base_zero = 0;

    public static void main(String[] args) {
//        long time = System.currentTimeMillis();
        int n = 0;



        while (n < value){
            n ++;
//            base[n] = fibonacci(n);
            System.out.println(fibonacci2(n, base_one, base_zero));
            System.out.println("base_zero : " + base_zero + ", base_one : " + base_one);
        }
        System.out.println(base[value]);
//        System.out.println((System.currentTimeMillis() - time) + "ms");
    }

    private static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return base[n-1] + base[n-2];
        }
    }

    private static int fibonacci2(int n, int base_one, int base_zero) {
        if (n == 0) {
            base_zero ++;
            return 0;
        } else if (n == 1) {
            base_one ++;
            return 1;
        } else {
            return fibonacci2(n-1, base_one, base_zero) + fibonacci2(n-2, base_one,base_zero);
        }
    }
}

