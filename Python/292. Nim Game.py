class Solution:
    def canWinNim(self, n):
        """
        :type n: int
        :rtype: bool
        """
        if n%4 == 0:return False
        else: return True
        
        # number of stones left
        # 1 win
        # 2 win
        # 3 win
        # 4 lose
        # 5, 5-1=4 win
        # 6, 6-2=4 win
        # 7, 7-3=4 win
        # 8 lose
        
