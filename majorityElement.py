# one for loop and hashmap
class Solution:
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """

        n = len(nums)
        times = n // 2
        
        h = {}
        
        for i in range(0,n):
            if nums[i] not in h:
                h[nums[i]] = 1
            if h[nums[i]] > times:
                return nums[i]
            else:
                h[nums[i]] += 1
        
# two pass + dictionary
def majorityElement1(self, nums):
    dic = {}
    for num in nums:
        dic[num] = dic.get(num, 0) + 1
    for num in nums:
        if dic[num] > len(nums)//2:
            return num
        
        
