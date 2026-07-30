class Solution {
    public String smallestPalindrome(String s) {
        int n=s.length();
        int j=0;
        int []freq=new int[26];
        char []ans=s.toCharArray();
        for(int i=0;i< n>>1;i++){
            freq[(ans[i]&31)-1]++;
        }
        for(int i=0;i<26;i++){
            while(freq[i]-- >0){
                ans[j]=(char)(97+i);
                ans[n-1-j]=(char)(97+i);
                j++;
            }
        }
        return new String(ans);
    }
}