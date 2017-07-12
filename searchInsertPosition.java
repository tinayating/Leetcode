/**
Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Here are few examples.
[1,3,5,6], 5 → 2
[1,3,5,6], 2 → 1
[1,3,5,6], 7 → 4
[1,3,5,6], 0 → 0

**/
//runtime: 6ms  beats 28.46%  too slow
public class Solution {
    public int searchInsert(int[] nums, int target) {
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i]==target){
                count = i;
                break;
            } 
            else if(nums[i]>target){
                count =i;
                break;
            }
            else{
                if(i==nums.length-1) count = nums.length;
            }
        }
        return count;
    }
}

//网友用了binary search的方法
//runtime: 5ms   beats 71%.  O(logN)
public int searchInsert(int[] A, int target) {
    int low = 0, high = A.length-1;
    while(low<=high){
        int mid = (low+high)/2;
        if(A[mid] == target) return mid;
        else if(A[mid] > target) high = mid-1;
        else low = mid+1;
    }
    return low;  //!注意return low!
}
