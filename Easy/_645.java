package Easy;

import java.util.Arrays;

public class _645 {
    public static int[] findErrorNums(int[] nums) {
        int[] hashTable= new int[nums.length+1];

        // PreComputing
        for(int i=0; i<nums.length; i++){
            hashTable[nums[i]]++;
        }

        int twoTimes=0;
        int correct=0;
        for (int i=1; i<hashTable.length; i++){
            if(hashTable[i]== 2) twoTimes=i;
            if(hashTable[i]== 0) correct=i;
        }

        int[] result= {twoTimes, correct};
        return result;
    }

    static void main(String[] args) {
        int[] result=findErrorNums(new int[]{1,2,2,3});
        System.out.println(Arrays.toString(result));
    }
}
