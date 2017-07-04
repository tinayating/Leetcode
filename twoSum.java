public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int result[] = new int[2];
        for(int i = 0; i < size; i++){
            if(map.containsKey(target-nums[i])){
                result[1] = i+1;
                result[0] = map.get(target-nums[i]);
                return result;
            }
            map.put(nums[i],i+1);
        }
        return null;
    }
}
