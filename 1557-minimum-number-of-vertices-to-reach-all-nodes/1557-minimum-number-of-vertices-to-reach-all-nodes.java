class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        boolean[] v=new boolean[n];
        for(List<Integer> i:edges)v[i.get(1)]=true;
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++)if(!v[i])ans.add(i);
        return ans;
    }
}