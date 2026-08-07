class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        ans=str(x)
        return ans==ans[::-1]
        