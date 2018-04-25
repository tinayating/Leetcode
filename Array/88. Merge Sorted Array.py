class Solution:
    def merge(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: void Do not return anything, modify nums1 in-place instead.
        """
        l = len(nums1)-1 #length of the array

        while m > 0 and n > 0:
            if nums1[m-1] > nums2[n-1]:
                nums1[l] = nums1[m-1]
                l -= 1
                m -= 1
            else: #nums1[m] <= nums2[n]
                nums1[l] = nums2[n-1]
                l -= 1
                n -= 1
                
        if n > 0:
            nums1[:n] = nums2[:n]
