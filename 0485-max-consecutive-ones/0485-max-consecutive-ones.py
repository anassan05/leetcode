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
                ans=max(ans,c)
                c=0
        return max(c,ans)
