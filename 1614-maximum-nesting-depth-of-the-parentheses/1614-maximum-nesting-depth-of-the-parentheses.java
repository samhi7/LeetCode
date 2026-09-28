class Solution {
    public int maxDepth(String s) {
        int n=s.length();
        int cnt=0;
        int ans=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                cnt++;
                ans=Math.max(cnt,ans);
            }else if(ch==')'){
                cnt--;
            }
        }
        return ans;
    }
}