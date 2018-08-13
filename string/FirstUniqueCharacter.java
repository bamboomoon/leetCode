package string;

import java.util.HashMap;

public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        /*int[] indexs = new int[26];
        for (int i = 0; i < s.length(); i++) {
            indexs[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (indexs[s.charAt(i) - 'a'] == 1) return i;
        }
        return -1;*/

        // 最优解
        int result = -1;
        // 遍历a-z
        for (char c = 'a'; c < 'z'; c++) {
            int tempIndex = s.indexOf(c); // 找到c 字符的下标，在字符串中的第一个下标
            if (tempIndex != -1 && tempIndex == s.lastIndexOf(c)) { // lastIndexOf字符串中最后一个下标。相等所以c字符是唯一的
                // result == -1, 说明当前字符可以作为唯一第一字符。如果不是-1，只要上一个唯一的下标大于当前的唯一字符下标，
                // 就可以把当前字符暂时作为第一不重复的字符
                if (result == -1 || result > tempIndex) result = tempIndex;
            }
        }
        return result;
    }
}

/*
* Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
Note: You may assume the string contain only lowercase letters.
* */
