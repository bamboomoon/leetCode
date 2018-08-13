package string;

import java.math.BigInteger;
import java.sql.Array;
import java.util.Arrays;

public class ReverseInteger {
    public int reverse(int x) {
        // x to string
        /*char[] chars = String.valueOf(x).toCharArray();
        char[] newChars = new char[chars.length];
        newChars[0] = '-';
        int start = x >= 0 ? 0 : 1;
        for (int i = chars.length - 1, j = start; i >= start; i--,j++) {
            newChars[j] = chars[i];
        }

        long reverseX = Long.parseLong(new String(newChars));
        if (reverseX > Integer.MAX_VALUE - 1 || reverseX < Integer.MIN_VALUE) {
            return 0;
        }

        return (int)reverseX;*/

        int value = 0;
        while (x != 0) {
            int last = x % 10; // 获取到x的最后一位
            int newValue = value * 10 + last;  // 后来的数排在后面
            if ((newValue - last) / 10 != value) { // 不相等，说明newValue已经溢出
                return 0;
            }
            value = newValue;
            x /= 10;
        }

        return value;
    }
}

/*
* Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
Note:
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1].
For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
反转之后的数字，超出了范围，就返回0
* */
