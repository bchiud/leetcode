package com.bradychiu.sorts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTest {
    @Test
    void one() {
        Integer[] input = new Integer[]{6, 3, 5, 1, 4, 2};
        Integer[] expected = new Integer[]{1, 2, 3, 4, 5, 6};

        Merge.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    void two() {
        Integer[] input = new Integer[]{1, 2, 3, 4, 6, 5};
        Integer[] expected = new Integer[]{1, 2, 3, 4, 5, 6};

        Merge.sort(input);
        assertArrayEquals(expected, input);
    }
}