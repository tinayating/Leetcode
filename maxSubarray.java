//网友的代码，太精妙了，怎么想的啊
/**
this problem was discussed by Jon Bentley (Sep. 1984 Vol. 27 No. 9 Communications of the ACM P885)

the paragraph below was copied from his paper (with a little modifications)

algorithm that operates on arrays: it starts at the left end (element A[1]) and scans through to the right end (element A[n]), keeping track of the maximum sum subvector seen so far. The maximum is initially A[0]. Suppose we've solved the problem for A[1 .. i - 1]; how can we extend that to A[1 .. i]? The maximum
sum in the first I elements is either the maximum sum in the first i - 1 elements (which we'll call MaxSoFar), or it is that of a subvector that ends in position i (which we'll call MaxEndingHere).

MaxEndingHere is either A[i] plus the previous MaxEndingHere, or just A[i], whichever is larger.
**/
public class Solution {
    public int maxSubArray(int[] nums) {
        int maxEndHere = nums[0];
        int maxSoFar = nums[0];
        for(int num:nums){
            maxEndHere = Math.max(maxEndHere+num,num);
            maxSoFar = Math.max(maxEndHere,maxSoFar);
        }
        return maxSoFar;
    }
}
