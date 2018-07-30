package array

//ContainsDuplicate array is have Duplicate value, yes return true,ohterwise retrun false
func ContainsDuplicate(nums []int) bool {
	counts := make(map[int]int)
	/// 自己写的，每个值都算了一遍
	// for _, v := range nums {
	// 	counts[v]++
	// }

	// for _, v := range counts {
	// 	if v > 1 {
	// 		return true
	// 	}
	// }

	// 提交代码之后，参考的。最大的不同就是遇到相同的就结束了 good
	// 还有一个做法 使用内置的sort函数排序之后，for 两两相邻的值是否相等
	for i := 0; i < len(nums); i++ {
		//这里如果能够进去，说明之前已经出现过一样的值 非0(这里是1) true 0 fale
		if _, ok := counts[nums[i]]; ok {
			return true
		}
		counts[nums[i]]++
	}
	return false
}

/*
Given an array of integers, find if the array contains any duplicates.

Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.

Example 1:

Input: [1,2,3,1]
Output: true
Example 2:

Input: [1,2,3,4]
Output: false
Example 3:

Input: [1,1,1,3,3,4,3,2,4,2]
Output: true
*/
