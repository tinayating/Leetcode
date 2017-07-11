/**
Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
**/
//我的解答好像违背了题目的意思。题目是想让我implment indexOf,而非直接调用。所以应该不能用到indexOf, substring. Solution1是对的。

public class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.contains(needle))
            return haystack.indexOf(needle);
        else
            return -1;
    }
}

/**
网友solution1 ！！！！好难想得到啊
**/
public int strStr(String haystack, String needle) {
  for (int i = 0; ; i++) {
    for (int j = 0; ; j++) {
      if (j == needle.length()) return i;
      if (i + j == haystack.length()) return -1;
      if (needle.charAt(j) != haystack.charAt(i + j)) break;
    }
  }
}



/**
网友soloution2
**/
public class Solution {
    public int strStr(String haystack, String needle) {
        int l1 = haystack.length(), l2 = needle.length();
        if (l1 < l2) {
            return -1;
        } else if (l2 == 0) {
            return 0;
        }
        int threshold = l1 - l2;
        for (int i = 0; i <= threshold; ++i) {
            if (haystack.substring(i,i+l2).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
