package day5;

import java.util.Arrays;

public class runningSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3, 4};
        System.out.println(Arrays.toString(runningSum(nums)));
        
    }
    static int[] runningSum(int[] nums) {
        int previousSum=0;
        int i =0;
        int[] arr = new int[nums.length];
        for ( int a: nums){
            previousSum+=a;
            arr[i]=previousSum;
            i+=1;

        }
        return arr;
        
    }
}
