package string;

public class StrStr {
    public int strStr(String haystack, String needle) {
        if (needle == null || needle.isEmpty()) return 0;
        int index = -1;
        int l1 = needle.length();
        int l2 = haystack.length();
        int i = 0;
       for (int j = 0; i < l1 && j < l2; j++) {
            if (index != -1) {
                if (needle.charAt(i) == haystack.charAt(j)) {
                    i++;
                } else {
                    i = 0;
                    j = index;
                    index = -1;
                }
            } else if (haystack.charAt(j) == needle.charAt(0)) {
                index = j;
                i++;
            }
        }
        if (i != l1) return -1;
        return index;
    }
}
/*
* Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2
Example 2:

Input: haystack = "aaaaa", needle = "bba"
Output: -1
Clarification:

What should we return when needle is an empty string? This is a great question to ask during an interview.

For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
* */
