class Solution:
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        if len(strs) == 0: return ""
        strs = sorted(strs)
        s = strs[0]
        out = ""
        for i,c in enumerate(s):
            for other in strs[1:]:
                if other[i] != c:
                    return out
            out += c
        return s
