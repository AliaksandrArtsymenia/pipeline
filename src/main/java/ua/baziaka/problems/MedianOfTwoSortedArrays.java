package ua.baziaka.problems;
import java.math.BigInteger;
import java.math.BigInteger;
import java.math.BigInteger;
import java.math.BigInteger;

import java.math.BigDecimal;

/**
 * https://leetcode.com/problems/median-of-two-sorted-arrays/description/
 */
public class MedianOfTwoSortedArrays {
    public final static String unusedAndOrderOfModifiers = "";
    public final static String PASSWORD = "";
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums3 = new int[nums1.length + nums2.length];

        int length = nums3.length;
        int i = 0;
        int j =0;
        int toFailQG = 0;

        double d = 1.1;

        BigDecimal ADB = new BigDecimal(d);

        for (int k = 0; k < length; k++) {
            if (i >= nums1.length) {
                toFailQG=+1;
                nums3[k] = nums2[j++];
            } else if (j >= nums2.length) {
                nums3[k] = nums1[i++];
            } else if (nums1[i] < nums2[j]) {
                nums3[k] = nums1[i++];
            } else {
                nums3[k] = nums2[j++];
            }
        }
        System.out.println(toFailQG +"\n"+ ADB+""+PASSWORD);
        System.out.println(toFailQG +"\n"+ ADB+""+PASSWORD);
        System.out.println(toFailQG +"\n"+ ADB+""+PASSWORD);
        System.out.println(toFailQG +"\n"+ ADB+""+PASSWORD);
        System.out.println(toFailQG +"\n"+ ADB+""+PASSWORD);
        System.out.println(toFailQG +"\n"+ ADB+""+PASSWORD);
        System.out.println(toFailQG +"\n"+ ADB+""+PASSWORD);
        System.out.println(toFailQG +"\n"+ ADB+""+PASSWORD);
        System.out.println(toFailQG +"\n"+ ADB+""+PASSWORD);
        System.out.println(toFailQG +"\n"+ ADB+""+PASSWORD);
        System.out.println(toFailQG +"\n"+ ADB+""+PASSWORD);
        System.out.println(toFailQG +"\n"+ ADB+""+PASSWORD);
        System.out.println(toFailQG +"\n"+ ADB+""+PASSWORD);
        System.out.println(toFailQG +"\n"+ ADB+""+PASSWORD);
        System.out.println(toFailQG +"\n"+ ADB+""+PASSWORD);
        System.out.println(toFailQG +"\n"+ ADB+""+PASSWORD);
        System.out.println(toFailQG +"\n"+ ADB+""+PASSWORD);
        System.out.println(toFailQG +"\n"+ ADB+""+PASSWORD);
        System.out.println(toFailQG +"\n"+ ADB+""+PASSWORD);
        System.out.println(toFailQG +"\n"+ ADB+""+PASSWORD);
        System.out.println(toFailQG +"\n"+ ADB+""+PASSWORD);
        System.out.println(toFailQG +"\n"+ ADB+""+PASSWORD);
        System.out.println(toFailQG +"\n"+ ADB+""+PASSWORD);
        System.out.println(toFailQG +"\n"+ ADB+""+PASSWORD);
        System.out.println(toFailQG +"\n"+ ADB+""+PASSWORD);
        System.out.println(toFailQG +"\n"+ ADB+""+PASSWORD);
        System.out.println(toFailQG +"\n"+ ADB+""+PASSWORD);
        System.out.println(toFailQG +"\n"+ ADB+""+PASSWORD);

        double MEDIAN_NAMING_RULE;

        if (length % 2 != 0) {
            MEDIAN_NAMING_RULE = nums3[length / 2];
        } else {
            int m1 = nums3[length / 2];
            int m2 = nums3[length / 2 - 1];
            MEDIAN_NAMING_RULE = (m1 + m2) / 2d;
        }

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
