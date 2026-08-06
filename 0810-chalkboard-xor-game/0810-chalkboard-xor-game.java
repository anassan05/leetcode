class Solution {
    public boolean xorGame(int[] nums) {
        int ans=0;
        for(int i:nums)ans^=i;
        return ans==0||nums.length%2==0;
    }
}