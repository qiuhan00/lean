package com.cfang.algorithm;

import java.util.Arrays;

/**
 * @author cfang 2020/9/28 11:33
 * @description
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        Arrays.stream(twoSum(nums, 9)).forEach(System.out::println);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = nums.length -1; j > i; j--){
                if(nums[i] + nums[j] == target){
                    result[0] = nums[i];
                    result[1] = nums[j];
                }
            }
        }
        return result;
    }

}
