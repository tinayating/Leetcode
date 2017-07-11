/**  Remove Duplicates From Sorted Array
Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

For example,
Given input array nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.


**/
public class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int n : nums){
            if(i == 0 || n != nums[i-1])
                nums[i++] = n;
        }
        return i;
    }
}



/**  Remove Element
Given an array and a value, remove all instances of that value in place and return the new length.

Do not allocate extra space for another array, you must do this in place with constant memory.

The order of elements can be changed. It doesn't matter what you leave beyond the new length.

Example:
Given input array nums = [3,2,2,3], val = 3

Your function should return length = 2, with the first two elements of nums being 2.
与上题类似
**/

public class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        for(int n : nums){
            if(n != val)
                nums[i++] = n;
        }
        return i;
    }
}
