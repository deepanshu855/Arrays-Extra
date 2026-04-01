package Easy;

//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

import java.util.*;

public class _217 {
    // Using set. because in leetCode this beats more solution but the time complexity of hashMap solution and set solution is same according to chatgpt.
    public boolean containsDuplicateSet(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n:nums){
            if(!set.add((n))){
                return true;
            }
        }
        return false;
    }

    // Using hashMap -> Done by me.
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> hm= new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(hm.containsKey(nums[i])) return true;
            hm.put(nums[i], 1);
        }
        return false;
    }
}
