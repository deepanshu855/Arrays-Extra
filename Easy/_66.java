package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _66 {
    public static int[] plusOne(int[] digits) {
        for(int i=digits.length-1; i>=0; i--){
            if(digits[i]!= 9){
                digits[i]= digits[i]+1;
                return digits;
            } else {
                digits[i]=0;
            }
        }

        int[] result= new int[digits.length+1];
        result[0]= 1;
        return result;
    }

    static void main(String[] args) {
        int[] result= plusOne(new int[]{1,9,9});
        System.out.println(Arrays.toString(result));
    }
}
