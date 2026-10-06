class Solution(object):
    def minAddToMakeValid(self, s):
        """
        :type s: str
        :rtype: int
        """
        o=ans=0
        for i in s:
            if i =="(":
                o+=1
            else:
                if o>0:
                    o-=1
                else:
                    ans+=1
        return ans+o