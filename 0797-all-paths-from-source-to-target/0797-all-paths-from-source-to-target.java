class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans=new ArrayList<>();
        dfs(ans,0,graph,new ArrayList<>());
        return ans;
    }
    void dfs(List<List<Integer>> ans,int i,int[][] graph,List<Integer> path){
        path.add(i);
        if(i==graph.length-1)ans.add(new ArrayList<>(path));
        else{
            for(int a:graph[i])dfs(ans,a,graph,path);
        }
        path.remove(path.size()-1);
    }
}