class Solution(object):
    def findMaxConsecutiveOnes(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        ans=0
        c=0
        for i in range(len(nums)):
            if nums[i]==1:
                c+=1
            else:
                if ans<c:
                    ans=c
                c=0
        if c>ans:
            return c
        return ans
