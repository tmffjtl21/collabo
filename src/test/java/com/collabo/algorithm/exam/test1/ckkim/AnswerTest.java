package com.collabo.algorithm.exam.test1.ckkim;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnswerTest {

    public Answer answer = new Answer();

    @Test
    void solve_ex1() {
        int[] example = {-1, 3, -1, 5};
        int result = 7;
        assertEquals( answer.solve(example), result);
    }

    @Test
    void solve_ex2() {
        int[] example = {-5, -3, -1};
        int result = -1;
        assertEquals( answer.solve(example), result);
    }

    @Test
    void solve_ex3() {
        int[] example = {2, 4, -2, -3, 8};
        int result = 9;
        assertEquals( answer.solve(example), result);
    }
}