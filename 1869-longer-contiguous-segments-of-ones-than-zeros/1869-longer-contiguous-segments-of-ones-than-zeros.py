class Solution(object):
    def checkZeroOnes(self, s):
        """
        :type s: str
        :rtype: bool
        """
        c1=c2=0
        c1max=c2max=0
        for i in s:
            if i=='1':
                c2=0
                c1+=1
                c1max=max(c1,c1max)
            else:
                c1=0
                c2+=1
                c2max=max(c2,c2max)
        return c1max>c2max