class Solution(object):
    def checkOnesSegment(self, s):
        """
        :type s: str
        :rtype: bool
        """
        f=True
        count=0
        for i in s:
            if f and i=='1':
                f=False
                count+=1
            elif i=='0':
                f=True
        return count==1
