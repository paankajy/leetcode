package december2021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InterscetionOfTwoArray {

    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> integers = new ArrayList<>();
        List<Integer> result1 = new ArrayList<>();
        List<Integer> result2 = new ArrayList<>();
        if (nums1.length < nums2.length) {
            for (int i = 0; i < nums1.length; i++) {
                integers.add(nums1[i]);
            }
        } else {
            for (int i = 0; i < nums2.length; i++) {
                integers.add(nums2[i]);
            }

            if (nums1.length > nums2.length) {
                for (int j = 0; j < nums1.length; j++) {
                    if (integers.contains(nums2[j])) {
                        result1.add(nums2[j]);
                    }
                }
            } else {
                for (int j = 0; j < nums1.length; j++) {
                    if (integers.contains(nums1[j])) {
                        result1.add(nums1[j]);
                    }
                }
            }
        }
        Arrays.sort(nums1);
        return nums1.length > nums2.length ? result1.stream().mapToInt(i -> i).toArray() : result2.stream().mapToInt(i -> i).toArray();
    }
    public static void main(String[] args) {

    }
}
