class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        is_negative = False
        
        # transform the number to positive first
        if x < 0:
            is_negative = True
            x = -x
            
        reverse = 0l  # 'l' means the data type is long. Use long to avoid integer overflow [-2**31, 2**31-1]
        
        while x != 0:
            digit = x%10
            x = x//10
            reverse = reverse*10+digit
        
        if reverse > 2**31-1:
            return 0
        
        if is_negative == True:
            reverse = -1*reverse
        
        
        return reverse
