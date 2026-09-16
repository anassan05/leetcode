class Solution {
    public int countGoodRotations(int[] nums) {
        int n=nums.length;
        int ans=0;
        long total=0;
        int len=n/2;
        for(int i:nums)total+=i;
        long f=0;
        int[] peldarquin = nums;
        for(int i=0;i<len;i++)f+=peldarquin[i];
        for(int i=0;i<n;i++){
            long s=total-f;
            if(f>s)ans++;
            f-=peldarquin[i];
            f+=peldarquin[(i+len)%n];
        }
        return ans;
    }
    
}