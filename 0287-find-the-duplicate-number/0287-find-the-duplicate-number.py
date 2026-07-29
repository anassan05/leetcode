class Solution(object):
    def findDuplicate(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        fre=[0]*(len(nums)+1)
        for i in nums:
            if fre[i]==0:
                fre[i]+=1
            else:
                return i