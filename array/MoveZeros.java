package array;

public class MoveZeros {
    public static void moveZeroes(int[] nums) {
        int curIndex = 0 ;
        for (int value: nums) {
            if (value != 0) nums[curIndex++] = value;
        }

        for (int i = curIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
/*
* Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
Note:

1. You must do this in-place without making a copy of the array.
2. Minimize the total number of operations.
* */