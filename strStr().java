/**
Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
**/

public class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.contains(needle))
            return haystack.indexOf(needle);
        else
            return -1;
    }
}
