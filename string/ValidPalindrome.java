package string;

public class ValidPalindrome {
    /*
    *  1. 首先明确回文，就是从中间对折，两边能够完全重合
    *  2. 题目中要求，只视数字和字母有效。所以遇到不是字母数字就要不处理
    *  3. 空字符串也是回文
    *  4. 结合以上几点可以指导，对折的地方不一定就是中间，因为有干扰字符[^0-9a-zA-Z]的存在
    * */
    public boolean isPalindrome(String s) {
        if (s == null) return false;
        if (s.isEmpty()) return true;
        byte[] bytes = s.getBytes();
        int i = 0, j = s.length() - 1;
        while (i < j) {
            byte iByte = bytes[i];
            byte jByte = bytes[j];
            // i
            if (iByte < 48 || (iByte > 57 && iByte < 65) || (iByte > 90 && iByte < 97) || iByte > 122) {
                i++; // 不是[0-9a-zA-Z]
                continue;
            }
            // j
            if (jByte < 48 || (jByte > 57 && jByte < 65) || (jByte > 90 && jByte < 97) || jByte > 122) {
                j--; // 不是[0-9a-zA-Z]
                continue;
            }

            if (iByte != jByte) {
                if (iByte <= 57 || jByte <= 57) {  // 其中有一个数字，就false
                    return false;
                }
                else if (iByte - jByte != 32 && iByte - jByte != -32) { // 不是同字符的大小写，就false
                    return false;
                }
            }

            i++;
            j--;
        }
        return true;
    }
}

/*
*Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

Note: For the purpose of this problem, we define empty string as valid palindrome.

Example 1:

Input: "A man, a plan, a canal: Panama"
Output: true
Example 2:

Input: "race a car"
Output: false
* */
