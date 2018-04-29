class Solution:
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        curSum = 0
        maxSum = -float('inf')
        
        for num in nums:
            curSum = max(num, curSum + num)
            maxSum = max(maxSum, curSum)
        
        return maxSum

    # Use to variable 'curSum' and 'maxSum'
