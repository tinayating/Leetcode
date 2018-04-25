class Solution:
    def canConstruct(self, ransomNote, magazine):
        """
        :type ransomNote: str
        :type magazine: str
        :rtype: bool
        """
        # use dict
        # construct a magazine dict
        mdict = {}
        for s in magazine:
            if s in mdict:
                mdict[s] = mdict[s] + 1
            else:
                mdict[s] = 1
        
        
        for r in ransomNote:
            if r not in mdict: return False
            if mdict[r] <= 0:
                return False
            else:
                mdict[r] = mdict[r] - 1
                
        return True
