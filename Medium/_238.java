package Medium;

//Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

import java.util.Arrays;

public class _238 {
    public static int[] productExceptSelf(int[] nums) {
        int [] prefix= new int[nums.length];
        int [] suffix= new int[nums.length];

        // Prefix computation:
        prefix[0]= 1;
        int temp=1;
        for(int i=1; i<nums.length; i++){
            temp= nums[i-1]*temp;
            prefix[i]= temp;
        }

        // Suffix computation:
        suffix[nums.length-1]= 1;
        temp=1;
        for(int i=nums.length-1; i>0; i--){
            temp*= nums[i];
            suffix[i-1]= temp;
        }

        for (int i=0; i<nums.length; i++){
            nums[i]= prefix[i]*suffix[i];
        }
        return nums;
    }

    static void main(String[] args) {
        int [] result= productExceptSelf(new int[]{1,2,3,4});
        System.out.println(Arrays.toString(result));
    }
}
