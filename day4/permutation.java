package day4;

import java.util.Arrays;

public class permutation {
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4}; 
        buildArray(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void buildArray(int[] nums){
int [] arr = new int[nums.length];
for(int i = 0;i<nums.length;i++){
    arr[i] = nums[nums[i]];
    System.out.println(nums[i]);
}

        //copying back to orginal
for(int i = 0;i<nums.length;i++){
    nums[i] = arr[i];
    System.out.println(nums[i]);
}
    }

}
