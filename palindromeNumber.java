/**
Original code written by me.
Runtime: 305 ms. Beats only 8.5% of people. Too slow!
Attention: 1.Negative integer is not palindrome number.
           2.Integer doesn't have length() method.
           3.Be care of negative number when getting the length. Should use Math.abs()
**/
public class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)  //negative integer is not palindrome number
            return false;
        else{
            int size = String.valueOf(Math.abs(x)).length();    
            int digit[] = new int[size];    //used to store each digit in the number
            for(int i = 0; i < size; i++){     
                digit[i] = x%10;
                x /= 10;
            }

            int halvedSize = size/2;
            for(int j = 0; j < halvedSize; j++){
                if(digit[j] == digit[size-(j+1)])   //compare the first digit and the last digit...
                    continue;
                else{
                    return false; 
                }
            }
            return true;    
        }
    }
}


/**
Improved code written by other coder.
**/


public class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int rev = 0;
        while(x>rev){
            rev= rev*10 + y%10;
            x /= 10;
        }
        return rev == x || rev/10 == x;
    }
}

/**
Improved code version(2)  Runtime: 195ms  Beats 90.09%
**/

public class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int y = x;
        int rev = 0;
        while(y>0){
            rev = rev*10 + y%10;
            y /= 10;
        }
        return rev == x;
    }
}
          




