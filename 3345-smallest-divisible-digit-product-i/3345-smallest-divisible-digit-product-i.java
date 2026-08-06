class Solution {
    public int smallestNumber(int n, int t) {
        while(!is(n,t)){
            n++;
        }
        return n;
    }
    boolean is(int n,int t){
        int ans=1;
        while(n>0){
            ans=ans*(n%10);
            n/=10;
        }
        return ans%t==0;

    }
}