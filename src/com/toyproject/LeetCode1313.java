package com.toyproject;

import java.util.Arrays;

public class LeetCode1313 {
    //1313. Decompress Run-Length Encoded List
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s);
        int[] nums = new int[4];
        nums[0] = 65;
        nums[1] = 44;
        nums[2] = 72;
        nums[3] = 15;
        int[] rs = s.decompressRLElist(nums);
        for (int i = 0; i < rs.length; i++) {
            System.out.println(i + ":" + rs[i]);
        }
    }

    static class Solution {
        public int[] decompressRLElist(int[] nums) {
            int size = 0;
            for (int i = 0; i < nums.length; i += 2) {
                size += nums[i];
            }
            int[] resultArr = new int[size];
            for (int pos = 0, i = 0; i < nums.length; pos += nums[i], i += 2) {
                Arrays.fill(resultArr, pos, pos + nums[i], nums[i + 1]);
            }
            return resultArr;
        }
    }
}
