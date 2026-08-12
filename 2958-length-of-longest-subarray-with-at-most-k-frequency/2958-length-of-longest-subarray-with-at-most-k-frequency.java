class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
       Map<Integer,Integer> m=new HashMap<>();
       int res=0,i=0,n=nums.length;
       for(int j=0;j<n;j++){
        m.put(nums[j],m.getOrDefault(nums[j],0)+1);
        while(m.get(nums[j])>k){
            m.put(nums[i],m.get(nums[i++])-1);
        }
        res=Math.max(res,j-i+1);
       } 
       return res;
    }
}