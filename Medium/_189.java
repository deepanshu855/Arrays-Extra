package Medium;

//Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

import java.util.Arrays;

public class _189 {
    public static void rotate(int[] nums, int k) {
        System.out.println(Arrays.toString(nums));
        k= k%nums.length;
        // To roate an array:
        // 1. Reverse the whole array.
        reverseArray(nums, 0, nums.length-1);
        // 2. Reverse k elements from start.
        reverseArray(nums, 0, k-1);
        // 3. Reverse (n-k) elements from last.
        reverseArray(nums, k, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    public static void reverseArray(int[] nums, int start, int end){
        while(start<end){
            int temp= nums[start];
            nums[start]= nums[end];
            nums[end]= temp;

            start++;
            end--;
        }
    }

    static void main(String[] args) {
        rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 9);
    }
}
