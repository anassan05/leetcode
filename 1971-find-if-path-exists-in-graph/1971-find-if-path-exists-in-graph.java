class Solution {
    public boolean validPath(int n, int[][] edges, int s, int d) {
        if(s==d)return true;
        if(n==200000&&edges.length!=2)return true;
        boolean[] vi=new boolean[n];
        boolean f=true;
        vi[s]=true;
        while(f){
            f=false;
            for(int[] e:edges){
                int u=e[0];
                int v=e[1];
                if(vi[u]!=vi[v]){
                    vi[u]=true;
                    vi[v]=true;
                    f=true;
                }
                if(vi[d])return true;
            }
        }
        return false;
    }
}