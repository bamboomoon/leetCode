package array

// MaxProfit url: https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/564/
func MaxProfit(prices []int) int {
	money := 0
	for i := 1; i < len(prices); i++ {
		if prices[i] > prices[i-1] {
			money += prices[i] - prices[i-1]
		}
	}
	return money
}
