package com.collabo.algorithm.exam.test5.ckkim;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnswerTest {

    @BeforeEach
    void setUp() {

    }

    @Test
    void solve() {
        Answer solver = new Answer();
        int[] example = {2, 5, 6, 1, 10};
        int target = 16;
        int[] answer = {2, 4};
        assertArrayEquals( solver.solve( example, target ), answer);
    }
}