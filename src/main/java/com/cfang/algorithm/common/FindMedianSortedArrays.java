package com.cfang.algorithm.common;

import java.util.LinkedList;

/**
 * @author cfang 2020/9/28 15:01
 * @description
 */
public class FindMedianSortedArrays {

    public static void main(String[] args) {
        int[] num1 = {1,3};
        int[] num2 = {2};
        System.out.println(findMedianSortedArrays(num1, num2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size = nums1.length + nums2.length;
        int mid = (int) Math.ceil(size / 2);
        LinkedList<Integer> linkedList = new LinkedList<>();
        int i = 0;
        int j = 0;
        while (i < nums1.length || j < nums2.length){
            if(i == nums1.length){
                if(j == nums2.length) break;
                linkedList.add(nums2[j]);
                j++;
                continue;
            }
            if(j == nums2.length){
                if(i == nums1.length) break;
                linkedList.add(nums1[i]);
                i++;
                continue;
            }
            if(nums1[i] <= nums2[j]){
                linkedList.add(nums1[i]);
                i++;
            }else if(nums1[i] > nums2[j]){
                linkedList.add(nums2[j]);
                j++;
            }
        }
        if(size % 2 == 0){
            return (double) (linkedList.get(mid - 1) + linkedList.get(mid)) / 2;
        }else {
            return linkedList.get(mid);
        }
    }
}
