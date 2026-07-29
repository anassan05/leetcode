class Solution(object):
    def maxSubArray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        ans=float('-inf')
        sum=0
        for i in nums:
            sum+=i
            if sum>ans:
                ans=sum
            if sum<0:
                sum=0

        return ans