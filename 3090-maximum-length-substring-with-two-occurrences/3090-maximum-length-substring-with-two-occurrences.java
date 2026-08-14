class Solution {
    public int maximumLengthSubstring(String s) {
        Map<Character,Integer> m=new HashMap<>();
        int l=0,ans=0;
        for(int i=0;i<s.length();i++){
            m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
            while(m.get(s.charAt(i))>2){
                m.put(s.charAt(l),m.get(s.charAt(l++))-1);
            }
            ans=Math.max(ans,i-l+1);
        }
        return ans;
    }
}