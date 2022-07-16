package main.leetcode.easyproblems.SquaresofaSortedArray;

import java.util.Arrays;

public class SquaresofaSortedArray {
    public static void main(String[] args) {
        int[] nums = new int[]{-4,-1,0,3,10};
        sortedSquares(nums);
    }
    public static int[] sortedSquares(int[] nums) {
        //square
        for(int i = 0; i < nums.length; i++){
            nums[i] = (int)Math.pow(nums[i], 2);
            System.out.println(nums[i]);
        }
        return Arrays.stream(nums).sorted().toArray();
    }
}
