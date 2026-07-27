class Solution {
    public int findJudge(int n, int[][] trust) {
        if(trust.length==0&& n==1)return 1;
        int[] arr=new int[n+1];
        for(int[] i:trust){
            arr[i[0]]--;
            arr[i[1]]++;
        }
        int j=0;
        for(int i:arr){
            if(i==n-1)return j;
            j++;
        }
        return -1;
    }
}