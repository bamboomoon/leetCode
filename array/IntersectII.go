package array

//Intersect 找两个数组的交集
func Intersect(nums1 []int, nums2 []int) []int {
	/*var newNums []int
	nums1Map := make(map[int]int)
	for _, v := range nums1 {
		nums1Map[v]++
	}

	nums2Map := make(map[int]int)
	for _, v := range nums2 {
		nums2Map[v]++
	}

	for k, v := range nums1Map {
		vCount := nums2Map[k]
		if v < vCount {
			vCount = v
		}
		for i := 0; i < vCount; i++ {
			newNums = append(newNums, k)
		}
	}
	*/

	// 优化代码
	var newNums []int
	// k == value in nums1, value == value count in nums1
	nums1Map := make(map[int]int)
	for _, v := range nums1 {
		nums1Map[v]++
	}

	for _, v := range nums2 {
		// get this value count in nums1
		if nums1Map[v] <= 0 {
			continue
		}

		// apppen this value to newNums
		newNums = append(newNums, v)
		nums1Map[v]--
	}

	//  What if the given array is already sorted? How would you optimize your algorithm?
	/*sort.Ints(nums1)
	sort.Ints(nums2)
	j := 0
	var newNums []int
	// What if nums1's size is small compared to nums2's size? Which algorithm is better?
	if len(nums1) < len(nums2) {
		nums1, nums2 = nums2, nums1
	}

	for i := 0; i < len(nums1) && j < len(nums2); i++ {
		v1 := nums1[i]
		v2 := nums2[j]
		if v2 == v1 {
			newNums = append(newNums, v1)
			j++
		} else if v2 < v1 {
			// v2（nums2当前步调的数）小于 v1.说明v2在nums1中是没有的
			// nums2的步调前进一步。nums1的步调后退一步，为了nums1当前步调的数可以和nums2后一步进行一个比较
			i--
			j++
		}
	}*/

	return newNums
}

/*

Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].

Note:
Each element in the result should appear as many times as it shows in both arrays.
The result can be in any order.
Follow up:
What if the given array is already sorted? How would you optimize your algorithm?
What if nums1's size is small compared to nums2's size? Which algorithm is better?
What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?

*/
