class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int n=nums.length;
        int[]xor=new int[n];
        int mask=(1<< maximumBit)-1;
        xor[0]=nums[0];
        for(int i=1;i<n;i++){
            xor[i]=xor[i-1]^nums[i];
        }
        int[]ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=mask^xor[n-i-1];
        }
        return ans;
    }
}