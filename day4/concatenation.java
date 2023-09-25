package day4;

import java.util.Arrays;

public class concatenation {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(Arrays.toString(getConcatenation(nums)));
        
    }
    static int[] getConcatenation(int[] nums) {
        int[] arr = new int[nums.length*2];
        int i;
        for(i = 0;i<nums.length;i++){
            arr[i] = nums[i];
        }
        int j;
        for(j=0;j<nums.length;j++){
            arr[i] = nums[j];
            i++;
        }
        return arr;
    }
}
