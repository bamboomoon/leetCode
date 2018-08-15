package string;

public class ValidAnagram {
    /*
    * 保证两点
    * 1. 字符相同
    * 2. 字符数量相同
    * */
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null || (s.length() != t.length())) return false;
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            count1[chars1[i] - 'a']++;
            count2[chars2[i] - 'a']++;
         }

         for (int i = 0; i < 26; i++) {
             if (count1[i] != count2[i]) return false;
         }
        return true;
    }
}

/*
*Given two strings s and t , write a function to determine if t is an anagram of s.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
Note:
You may assume the string contains only lowercase alphabets.

Follow up:
What if the inputs contain unicode characters? How would you adapt your solution to such case?
* */