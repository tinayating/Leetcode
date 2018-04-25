class Solution:
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        if x < 0: return False
        origin = x
        psum = 0
        while x > 0:
            digit = x % 10
            psum = psum*10 + digit #sum of palindrome
            x = x//10
        if psum == origin:
            return True
    
        else:
            return False

        
