class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        helper(0,nums,ans,new ArrayList<Integer>());
        return ans;
    }
    static void helper(int i,int[] nums,List<List<Integer>> ans, List<Integer>l){
        if(i==nums.length) {
            ans.add(new ArrayList<>(l));
            return ;
            }
        helper(i+1,nums,ans,l);
        l.add(nums[i]);
        helper(i+1,nums,ans,l);
        l.remove(l.size()-1);
    }
}