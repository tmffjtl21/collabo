package com.collabo.algorithm.exam.test5.ckkim;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test5AnswerTest {

    @Test
    void solve() {
        Test5Answer answer = new Test5Answer();
        int[] array = {1,2,3,4};
        assertEquals(answer.solve(array), false);
    }
}