class Solution(object):
    def maxAreaOfIsland(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: int
        """
        # row number n
        # col number m
        if len(grid) == 0: return 0
        
        n = len(grid)
        m = len(grid[0])
        
        totalMax = 0
        
        def helper(grid,i,j):
            if i < 0 or j < 0 or i == n or j == m or grid[i][j] == 0:
                return 0
            
            if grid[i][j] == 1:
                curMax = 1
                grid[i][j] = 0
                left = helper(grid,i-1,j)
                right = helper(grid,i+1,j)
                up = helper(grid,i,j+1)
                down = helper(grid,i,j-1)
                curMax += left + right + up + down 
                # totalMax = max(curMax, totalMax)
            return curMax
                
        for row in range(n):
            for col in range(m):
                out = helper(grid,row,col)
                if out > totalMax:
                    totalMax = out
                
        return totalMax
