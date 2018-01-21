//mine. Too complicated and low efficiency.
class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            if(target < nums[0])
                return 0;
            if(nums[i] == target)
                return i;
            if(nums[i] < target){
                if(i < nums.length - 1 && nums[i+1] > target){
                    return i + 1;
                }else if(i == nums.length - 1)
                    return i + 1;
            }
        }
        return 0;
    }
}

//Use binary search
class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0; 
        int high = nums.length - 1;
        
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return low;
    }
}
