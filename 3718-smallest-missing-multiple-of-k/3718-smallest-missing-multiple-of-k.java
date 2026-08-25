class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> s=new HashSet<>();
        for(int i:nums)s.add(i);
        int sum=k;
        while(s.contains(sum))sum+=k;
        return sum;
    }
}