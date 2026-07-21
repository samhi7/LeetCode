class Solution {
    public boolean canJump(int[] nums) {
        int maxind=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(maxind<i)return false;
            maxind=Math.max(maxind,i+nums[i]);
        }
        return true;
    }
}