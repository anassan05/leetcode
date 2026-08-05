class Solution {
    public int numSplits(String s) {
        int ans=0;
        int[] a1=new int[26];
        int[] a2=new int[26];
        int l=0,r=0;
        for(char i:s.toCharArray()){
            if(a1[i-'a']==0)l++;
            a1[i-'a']++;
        }
        for(char i:s.toCharArray()){
            int cur=i-'a';
            if(--a1[cur]==0)l--;
            if(a2[cur]++==0)r++;
            if(l==r)ans++;
        }
        return ans;
    }
}