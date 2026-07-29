class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean[] visited=new boolean[n];
        int ans=0;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                ans++;
                dfs(isConnected,i,visited);
            }
        }
        return ans;
    }
    void dfs(int[][] arr,int s,boolean[] visited){
        visited[s]=true;
        for(int i=0;i<arr.length;i++){
            if(arr[s][i]==1&&!visited[i]){
                dfs(arr,i,visited);
            }
        }
    }
}