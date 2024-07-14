//Facebook(Leetcode)
// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

// If target is not found in the array, return [-1, -1].

// You must write an algorithm with O(log n) runtime complexity.

// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]

import java.util.Arrays;

public class First_and_last_postion {
    public static int[] searchRange(int[] nums, int target) {
        int [] arr=new int[2];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                arr[0]=i;
                break;
            }
        }
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]==target){
                arr[1]=i;
                break;
            }
        }
        return arr;
        
    }
    public static void main(String[] args) {
        int[] nums={5,7,7,8,8,10};
        int target=8;
        int[] ans=searchRange(nums,target);
        System.out.println((Arrays.toString(ans)));
    }

    
}