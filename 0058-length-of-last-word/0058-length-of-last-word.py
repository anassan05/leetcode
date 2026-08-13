class Solution(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        s=s.strip()
        ans=0
        for i in range(len(s)-1,-1,-1):
            if s[i]==" ":
                return ans
            ans+=1
        return ans
        