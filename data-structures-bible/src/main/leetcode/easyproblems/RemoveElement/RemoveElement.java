package main.leetcode.easyproblems.RemoveElement;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = new int[]{0,1,2,2,3,0,4,2};
        removeElement(arr,2);
    }
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
