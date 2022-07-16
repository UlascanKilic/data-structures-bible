package leetcode.easyproblems.FindNumberswithEvenNumberofDigits;

public class FindNumberswithEvenNumberofDigits {

    public static void main(String[] args) {
        int[] nums = new int[]{555,90,482,1771};
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++){
            int digitCount = 0;
            while (nums[i] != 0){
                nums[i] = nums[i] / 10;
                digitCount++;
            }
            if(digitCount % 2 == 0)
                sum++;
        }
        return sum;
    }
}
