class Solution {
    public int findMiddleIndex(int[] nums) {
        int n=nums.length;
        int tot=0;
        for(int i=0;i<n;i++){
            tot+=nums[i];
        }
        int left=0;
        int right=tot;
        for(int i=0;i<n;i++){
            if(left==right-nums[i]){
                return i;
            }
            left+=nums[i];
            right-=nums[i];
        }
        return -1;
    }
}