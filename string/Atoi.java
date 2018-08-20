package string;

public class Atoi {
    // 注意： 字符串类型的题目，若非必要不要去转换为字节来使用，直接使用字符。转换为字节性能很差很差
    public int myAtoi(String str) {
        if (str == null || str.isEmpty()) return 0;
        int number = 0;
        boolean isPlus = true;
        boolean begin = false;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= '0' && c <= '9') {
                begin = true;
                int newNumber = number * 10 + (c - '0');
                if (newNumber % 10 != (c - '0')) {
                    return isPlus ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                number = newNumber;
            } else if (begin) {
                break;
            } else {
                if (c == '-') {
                    isPlus = false;
                    begin = true;
                } else if (c == '+') {
                    begin = true;
                } else if (c != ' ') {
                    break;
                }
            }
        }

        return isPlus ? number : -number;
    }
}
/*
* The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.

If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.

If no valid conversion could be performed, a zero value is returned.

Note:

Only the space character ' ' is considered as whitespace character.
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. If the numerical value is out of the range of representable values, INT_MAX (231 − 1) or INT_MIN (−231) is returned.
Example 1:

Input: "42"
Output: 42
Example 2:

Input: "   -42"
Output: -42
Explanation: The first non-whitespace character is '-', which is the minus sign.
             Then take as many numerical digits as possible, which gets 42.
Example 3:

Input: "4193 with words"
Output: 4193
Explanation: Conversion stops at digit '3' as the next character is not a numerical digit.
Example 4:

Input: "words and 987"
Output: 0
Explanation: The first non-whitespace character is 'w', which is not a numerical
             digit or a +/- sign. Therefore no valid conversion could be performed.
Example 5:

Input: "-91283472332"
Output: -2147483648
Explanation: The number "-91283472332" is out of the range of a 32-bit signed integer.
             Thefore INT_MIN (−231) is returned.
*
* */