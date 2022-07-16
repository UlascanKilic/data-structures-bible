package main.leetcode.easyproblems.DuplicateZeros;

public class DuplicateZeros {

    public static void main(String[] args) {
        int[] arr = new int[]{1,0,2,3,0,4,5,0};
        duplicateZeros(arr);
    }

    public static void duplicateZeros(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0 && i != arr.length-1){
                //shift
                if (arr.length - 2 - i >= 0) System.arraycopy(arr, i + 1, arr, i + 1 + 1, arr.length - 2 - i);
                arr[i+1] = 0;
                i++;
            }
        }
    }
}
