class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
       if(k==n){
        int max=-1;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,nums[i]);
        }
        return max;
       }
       int count[]=new int[51];
       for(int i=0;i<n;i++){
        count[nums[i]]++;
       }
       if(k==1){
        for(int i=50;i>0;i--){
            if(count[i]==1){
                return i;
            }
        }
        return -1;
       }
       int ans=-1;
       if(count[nums[0]]==1){
        ans=Math.max(ans,nums[0]);
       }
       if(count[nums[n-1]]==1){
        ans=Math.max(ans,nums[n-1]);
       }
       return ans;
       
    }
}