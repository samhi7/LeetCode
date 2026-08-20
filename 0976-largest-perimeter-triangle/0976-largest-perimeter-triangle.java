class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=n-1;i>=2;i--){
            int x=nums[i-2];
            int y=nums[i-1];
            int z=nums[i];
            if(x+y>z){
                return x+y+z;
            }
        }
        return 0;
    }
}