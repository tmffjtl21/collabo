package com.collabo.algorithm.exam.test2.ckkim;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnswerTest {

    public Answer answer = new Answer();
    @Test
    void solve() {
        int number = 12;
        int result = 10;
        // 0 1 1 2 3 5 8 13 : 2 + 8 = 10
        assertEquals( answer.solve(number), result);
    }

    @Test
    void solve_ex1() {
        int number = 50;
        int result = 44;
        // 0 1 1 2 3 5 8 13 21 34 : 2 + 8 + 34 = 44
        assertEquals( answer.solve(number), result);
    }
}