package main.leetcode.easyproblems.MergeSortedArray;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = new int[]{-1,0,0,3,3,3,0,0,0};
        int[] nums2 = new int[]{1,2,2};

        merge(nums1,6,nums2,3);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int secondNumPointer = 0;

        for(int i = m; i < n+m;i++){
            if(nums1[i] == 0 && secondNumPointer < n){
                nums1[i] = nums2[secondNumPointer];
                int j = i;
                while(j-1 >= 0 && nums1[j] < nums1[j-1]){
                    nums1[j] += nums1[j-1];
                    nums1[j-1] = nums1[j] - nums1[j-1];
                    nums1[j] -= nums1[j-1];
                    j--;
                }
                secondNumPointer++;
            }
        }
    }
}
