//网友算法，在CC上看到类似的算法
//二分法寻找根，不用从1到n遍历，会出现integer overflow
public class Solution {
    public int mySqrt(int x) {
        if (x == 0)
            return 0;
        int left = 1, right = Integer.MAX_VALUE;
        while (true) {
            int mid = left + (right - left)/2;
            if (mid > x/mid) {
                right = mid - 1;
            } else {
                if (mid + 1 > x/(mid + 1))
                    return mid;
                left = mid + 1;
            }
        }
    }
}

//Compute integer square root of a number (CC)
int sqrt(int n) {
    return sart_helper(n,1,n);
}

int sqrt_helper(int n, int min, int max){
    if(max < min) return -1; // no square root
    int guess = (min+max)/2;
    if(guess * guess == n) //found it!
        return guess;
    else if(guess*guess < n)
        return sqrt_helper(n,guess+1,max); //try higher
    else
        return sqrt_helper(n,min,guess-1); //try lower
}
