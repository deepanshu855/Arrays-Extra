package Medium;

//Given an integer array nums, find the subarray with the largest sum, and return its sum

public class _53 {
    public static int maxSubArray(int[] nums) {
        int ans= nums[0];
        int currSum= nums[0];

        for (int i=1; i<nums.length; i++){
            if(currSum<0) currSum= 0;
            currSum+= nums[i];
            ans= Math.max(ans, currSum);
        }
        return ans;
    }

    static void main(String[] args) {
        int result= maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4});
        System.out.println(result);
    }
}
