package array

//Rotate1 first mehond
func Rotate1(nums []int, k int) {
	length := len(nums)
	if k < 0 {
		return
	}
	k %= length

	spin(nums, 0, length-k-1)
	spin(nums, length-k, length-1)
	spin(nums, 0, length-1)
}

// rotate by self
func spin(nums []int, begin int, end int) {
	for begin < end {
		//exchange
		nums[begin], nums[end] = nums[end], nums[begin]
		begin++
		end--
	}
}

//Rotate2 second method
func Rotate2(nums []int, k int) {
	length := len(nums)
	if k < 0 {
		return
	}

	k %= length

	// use Auxiliary array
	backNums := make([]int, k)
	copy(backNums, nums[length-k:])

	index := length - k - 1
	for index >= 0 {
		nums[index+k] = nums[index]
		index--
	}

	index = 0
	for index < k {
		nums[index] = backNums[index]
		index++
	}
}

/*
Given an array, rotate the array to the right by k steps, where k is non-negative.

Example 1:

Input: [1,2,3,4,5,6,7] and k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: [-1,-100,3,99] and k = 2
Output: [3,99,-1,-100]
Explanation:
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
Note:

Try to come up as many solutions as you can, there are at least 3 different ways to solve this problem.
Could you do it in-place with O(1) extra space?
*/
