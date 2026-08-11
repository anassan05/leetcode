class Solution {
    public int missingInteger(int[] nums) {
        Set<Integer> s=new HashSet<>();
        int sum=nums[0];
        for(int i:nums)s.add(i);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1)sum+=nums[i];
            else break;
        }
        while(s.contains(sum))sum++;
        return sum;
    }
}