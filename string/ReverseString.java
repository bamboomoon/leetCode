package string;

public class ReverseString {
    public String reverseString(String s) {
        if (s == null) return "";
        int length = s.length();
        int middle = length / 2;
        char[] chars = s.toCharArray();
        for (int i = 0; i < middle; i++) {
            char temp = chars[i];
            int end = length - 1 - i;
            chars[i] = chars[end];
            chars[end] = temp;
        }
        return new String(chars);
    }
}

/*
Write a function that takes a string as input and returns the string reversed.

Example 1:

Input: "hello"
Output: "olleh"
Example 2:

Input: "A man, a plan, a canal: Panama"
Output: "amanaP :lanac a ,nalp a ,nam A"
* */
