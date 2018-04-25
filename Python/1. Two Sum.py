class Solution:
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        ndict = dict()
        
        for i,v in enumerate(nums):
            if target - v in ndict:
                return [ndict[target-v],i]
            else:
                ndict[v] = i
                
        return False
