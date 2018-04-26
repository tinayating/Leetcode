class Solution:
    def hammingDistance(self, x, y):
        """
        :type x: int
        :type y: int
        :rtype: int
        """
        
        ans = x^y
        ones = 0
        while ans > 0:
            remainder = ans%2
            if remainder == 1:
                ones += 1
            ans = ans//2
        return ones
            
        # return bin(x^y).count('1')  
        
        #topic: bit manipulation
