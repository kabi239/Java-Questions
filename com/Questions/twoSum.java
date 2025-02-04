package com.Questions;
import java.util.Arrays;
import java.util.HashMap;

public class twoSum {
    public int[] twoSum1(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }

    public int[] twoSum2(int[] nums, int target) {
        int arr[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int remaining = target - nums[i];
            if (map.containsKey(remaining)) {
                arr[0] = map.get(remaining);
                arr[1] = i;
            } else {
                map.put(nums[i], i);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int a[] = { 2, 7, 11, 15 };
        System.out.println(Arrays.toString(new twoSum().twoSum2(a, 9)));

    }
}
