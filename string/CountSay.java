package string;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;

public class CountSay {
    public String countAndSay(int n) {
        String result = "1";
        for (int j = 1; j < n; j++ ) {
            char curChar = result.charAt(0);
            int count = 1;
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i < result.length(); i++) {
                if (curChar == result.charAt(i)) { // 遇到相同的字符，个数就累加
                    count++;
                } else { // 不同的字符，就拼接
                    sb.append(count);
                    sb.append(curChar);
                    curChar = result.charAt(i);
                    count = 1;
                }
            }
            // for 结束之后，curChar 还记录着一个字符
            sb.append(count);
            sb.append(curChar);

            // 这个结果作为下一个的输入
            result = sb.toString();
        }

        return  result;
    }
}

/*
* 解读思路：每个序列读到的数都要依赖上一个读到的数。所以必须每个数都读出来。 所以必须for一个一个来
* */

/*
* The count-and-say sequence is the sequence of integers with the first five terms as following:

1.     1
2.     11
3.     21
4.     1211
5.     111221
1 is read off as "one 1" or 11.
11 is read off as "two 1s" or 21.
21 is read off as "one 2, then one 1" or 1211.
Given an integer n, generate the nth term of the count-and-say sequence.

Note: Each term of the sequence of integers will be represented as a string.

Example 1:

Input: 1
Output: "1"
Example 2:

Input: 4
Output: "1211"
* */
