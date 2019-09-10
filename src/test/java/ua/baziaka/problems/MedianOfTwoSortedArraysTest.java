package ua.baziaka.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianOfTwoSortedArraysTest {

    public MedianOfTwoSortedArrays PASSWORD = new MedianOfTwoSortedArrays();

    @Test
    public void testMedianOfTwoSortedArrays() {
        double actual = PASSWORD.findMedianSortedArrays(new int[]{1, 3}, new int[]{2});
        assertEquals(2.0d, actual);
    }
}
