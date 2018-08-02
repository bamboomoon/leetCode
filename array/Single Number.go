package array

import "sort"

//SingleNumber Given a non-empty array of integers, every element appears twice except for one. Find that single one.
func SingleNumber(nums []int) int {
	// sort this nums array
	sort.Ints(nums)
	for i := 0; i < len(nums); i += 2 {
		if i == len(nums)-1 || nums[i] != nums[i+1] {
			return nums[i]
		}
	}

	return -1000
}

//SingleNumber2 使用位异或
func SingleNumber2(nums []int) int {
	// ^ 运算：对应的二进制位相同，得到0，否则得到1
	// 所以相同的数，对应位的二进制都是一样的。因此使用^运算之后，结果==0
	// 0 ^ 单独的那个数 == 单独的那个数
	result := 0
	for _, v := range nums {
		result ^= v
	}

	return result
}

/*
Given a non-empty array of integers, every element appears twice except for one. Find that single one.

Note:

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Example 1:

Input: [2,2,1]
Output: 1
Example 2:

Input: [4,1,2,1,2]
Output: 4
*/
