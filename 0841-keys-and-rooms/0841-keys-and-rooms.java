class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] v=new boolean[rooms.size()];
        dfs(rooms,0,v);
        for(boolean i:v)if(!i)return false;
        return true;
    }
    void dfs(List<List<Integer>> rooms,int cur,boolean[] v){
        // if(cur>=rooms.length)return;
        v[cur]=true;
        for(int i:rooms.get(cur))if(!v[i])dfs(rooms,i,v);
    }
}