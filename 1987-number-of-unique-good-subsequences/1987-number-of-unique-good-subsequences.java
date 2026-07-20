class Solution {
    public int numberOfUniqueGoodSubsequences(String binary) {
        int mod=1000000007;
        int e0=0,e1=0;
        boolean f=false;
        for(char i:binary.toCharArray()){
            if(i=='0'){
                f=true;
                e0=(e0+e1)%mod;
            }
            else e1=(e1+e0+1)%mod;
        }
        return f?(e0+e1+1)%mod:(e0+e1)%mod;
    }
}