package binarysearch;

import java.util.Arrays;

public class SearchRange {

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] found = searchRange(nums, target);
        System.out.println(Arrays.toString(found));
    }
    public static int[] searchRange(int[] nums, int target) { 

        int start = 0;
        int end = nums.length-1;

        int[] toAns = {-1,-1};

        // first value---
        while(start<=end){
            int mid = start + (end-start)/2;

            if(target<nums[mid]) {
                end = mid-1;
            }else if (target > nums[mid]) {
                start = mid +1;
            }else {
                toAns[0] = mid;
                //target == nums[mid]
                end = mid-1;
            }

        }


        start = 0;
        end = nums.length-1;

        // Last value ---
        while(start<=end){
            int mid = start + (end-start)/2;

            if(target<nums[mid]) {
                end = mid-1;
            }else if (target > nums[mid]) {
                start = mid +1;
            }else {
                toAns[1] = mid;
                // target == nums[mid]
                start = mid +1;
            }

        }
        return toAns;
    }

}