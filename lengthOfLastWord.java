public class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        s = s.trim();
        if(s == "") return 0;
        else if(s.indexOf(' ') == -1) return s.length();
        else{
            for(int i = s.length()-1; i>=0;i--){
                if(s.charAt(i) != ' ')
                    count++;
                else
                    break;
            }
            return count;
        }
    }
}
