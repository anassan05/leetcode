class Solution {
    public int minimumPushes(String word) {
        int n=word.length();
        int a=n/8;
        return (a*(a+1)*4)+(n%8)*(a+1);
    }
    
}