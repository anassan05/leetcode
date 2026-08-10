class Solution(object):
    def searchInsert(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        i=0
        for j in nums:
            if j>=target:
                return i
            i+=1
        return i
        