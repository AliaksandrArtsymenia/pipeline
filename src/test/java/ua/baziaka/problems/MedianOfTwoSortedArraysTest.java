package ua.baziaka.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianOfTwoSortedArraysTest {

    MedianOfTwoSortedArrays toTestAlg = new MedianOfTwoSortedArrays();

    @Test
    public void testMedianOfTwoSortedArrays() {
        double actual = toTestAlg.findMedianSortedArrays(new int[]{1, 3}, new int[]{2});
        assertEquals(2.0d, actual);
    }
}
