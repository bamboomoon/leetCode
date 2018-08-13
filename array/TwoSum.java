package array;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // <value, index>
        HashMap<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // get index
            Integer index = numsMap.get(target - nums[i]);
            // if index != null mean this target - nums[i] aleready exist.so return index and current i
            if (index != null)  return new int[]{index, i};
            numsMap.put(nums[i], i);
        }

        return null;
    }
}

/*
* Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

思路： 借助HashMap。 值为key,下标为value. 遇到一个数9-这个数，在HashMap中已经存在，说明9-这个数已经存在，刚9-这个数和当前数刚好匹配
* */
