package array

//RemoveDuplicates 使用原地算法 移除重复的数据
//URL: https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/
func RemoveDuplicates(nums []int) int {
	if len(nums) == 0 {
		return 0
	}
	// new array lenth
	length := 1
	for _, value := range nums {
		if value != nums[length-1] {
			//find a new elemt, then replace replaceIndex's value use it
			nums[length] = value
			length++
		}
	}
	return length
}
