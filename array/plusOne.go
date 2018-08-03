package array

//PlusOne digites每个元素都是个位数
func PlusOne(digits []int) []int {
	for i := len(digits) - 1; i >= 0; i-- {
		if digits[i] == 9 {
			digits[i] = 0
		} else {
			digits[i]++
			return digits
		}
	}

	// 每个元素都是9
	newArray := make([]int, len(digits)+1)
	newArray[0] = 1
	return newArray
}

/*
Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.
*/
