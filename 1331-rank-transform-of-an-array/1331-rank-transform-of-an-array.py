class Solution(object):
    def arrayRankTransform(self, arr):
        """
        :type arr: List[int]
        :rtype: List[int]
        """
        rank={}
        for i,j in enumerate(sorted(set(arr)),1):
            rank[j]=i
        return [rank[i] for i in arr]
        