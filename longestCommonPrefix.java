/**
Runtime: 11ms. Beats 67.04%
**/

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) 
            return "";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < strs[0].length(); i++){
            char c = strs[0].charAt(i);
            for(String s:strs){
                if(s.length() < i+1 || c != s.charAt(i)) return sb.toString();  //注意或条件的顺序。要先判断长度，否则会报错：indexOutOfRange
            }
            sb.append(c);
        }
        return sb.toString();
    }
}


/**
Other solutions:
**/
