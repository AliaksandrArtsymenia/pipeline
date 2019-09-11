package ua.baziaka.problems;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/median-of-two-sorted-arrays/description/
 */
public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //      12 Bugs for SonarQube's Quality Gates
        double d = 1.1;
        BigDecimal bd1 = new BigDecimal(d); // Noncompliant; see comment above
        BigDecimal bd2 = new BigDecimal(1.1); // Noncompliant; same result
        BigDecimal bd3 = new BigDecimal(d); // Noncompliant; see comment above
        BigDecimal bd4 = new BigDecimal(1.1); // Noncompliant; same result
        BigDecimal bd5 = new BigDecimal(d); // Noncompliant; see comment above
        BigDecimal bd6 = new BigDecimal(1.1); // Noncompliant; same result
        BigDecimal bd7 = new BigDecimal(d); // Noncompliant; see comment above
        BigDecimal bd8 = new BigDecimal(1.1); // Noncompliant; same result
        BigDecimal bd9 = new BigDecimal(d); // Noncompliant; see comment above
        BigDecimal bd10 = new BigDecimal(1.1); // Noncompliant; same result
        BigDecimal bd11 = new BigDecimal(d); // Noncompliant; see comment above
        BigDecimal bd12 = new BigDecimal(1.1); // Noncompliant; same result
        List<BigDecimal> bugsList = Arrays.asList(bd1, bd2, bd3, bd4, bd5, bd6, bd7, bd8, bd9, bd10, bd11, bd12);
        bugsList.forEach(System.out::println);

        int[] nums3 = new int[nums1.length + nums2.length];

        int length = nums3.length;
        int i = 0;
        int j =0;

        for (int k = 0; k < length; k++) {
            if (i >= nums1.length) {
                nums3[k] = nums2[j++];
            } else if (j >= nums2.length) {
                nums3[k] = nums1[i++];
            } else if (nums1[i] < nums2[j]) {
                nums3[k] = nums1[i++];
            } else {
                nums3[k] = nums2[j++];
            }
        }

        double MEDIAN_NAMING_RULE;

        if (length % 2 != 0) {
            MEDIAN_NAMING_RULE = nums3[length / 2];
        } else {
            int m1 = nums3[length / 2];
            int m2 = nums3[length / 2 - 1];
            MEDIAN_NAMING_RULE = (m1 + m2) / 2d;
        }

        return MEDIAN_NAMING_RULE;
    }
}
