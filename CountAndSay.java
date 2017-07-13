//39ms beats 10.8%
public class Solution {
    public String countAndSay(int n) {
        String s;
        String next="1"; 
        if(n==1) return next;
        for(int i = 0; i < n-1; i++){
            int count = 1; 
            s = next;
            next = "";
            for(int j = 0; j < s.length(); j++){
                if(s.length()==1) next = ""+count+s.charAt(j);
                else{
                    if(j<s.length()-1 && s.charAt(j)==s.charAt(j+1)){
                    count++;
                    }
                    else{
                        next= next+""+count+s.charAt(j);
                        count = 1;
                    }    
                }  
            }
        }
        return next;  
    }
}
