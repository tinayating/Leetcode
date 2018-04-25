class Solution:
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        out = 0
        for i in range(len(nums)):
            out ^= nums[i]
            
        return out
            
# bit manipulation
# & AND 都为1才为1
# | OR  只要有1就是1
# ^ XOR  全一样为0，不一样为1，所以自己和自己XOR为0
