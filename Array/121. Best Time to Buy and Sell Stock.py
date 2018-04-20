import math
class Solution:
    def maxProfit(self, prices):
        """
        :type prices: List[int]
        :rtype: int
        """
        if len(prices) == 0:
            return 0
        
        minPrice, maxProfit = prices[0], -math.inf
        
        for p in prices:
            minPrice = min(p, minPrice)
            profit = p - minPrice
            maxProfit = max(profit, maxProfit)
        
        return maxProfit
                            
