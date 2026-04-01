package Easy;

//Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.

public class _414 {
    public static int thirdMax(int[] nums) {
        int max= nums[0];
        int secondMax= Integer.MIN_VALUE;
        for(int i=1; i<nums.length; i++){
            if(nums[i]>max){
                secondMax= max;
                max= nums[i];
            } else if(nums[i]!= max){
                secondMax=Math.max(secondMax, nums[i]);
            }
        }

        int thirdMax= Integer.MIN_VALUE;
        int flag=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>=thirdMax && nums[i]<secondMax && nums[i]<max){
                thirdMax= nums[i];
                flag=1;
            }
        }

        return (flag==1) ?thirdMax : max;
    }

    static void main(String[] args) {
        int result= thirdMax(new int[]{7,2,7,6,5,4,3,6});
        System.out.println(result);
    }
}
