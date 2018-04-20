import math
class Solution:
    def thirdMax(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums = set(nums)
        v = [-math.inf, -math.inf, -math.inf]
        for num in nums:
            if num > v[0]:
                v = [num, v[0], v[1]]
            elif num > v[1]:
                v = [v[0], num, v[1]]
            elif num > v[2]:
                v = [v[0],v[1],num]

        if -math.inf in v:
            return max(v)
        else:
            return v[2]

   
# For java, use size = k MinHeap to store the top k number. The kth largest will be on the top.
