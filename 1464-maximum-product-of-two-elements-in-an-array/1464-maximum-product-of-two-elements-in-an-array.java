class Solution {
    public int maxProduct(int[] nums) {
        int m1=0;
        int m2=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(m1<nums[i]){
                m2=m1;
                m1=nums[i];
                
            }else if(m2<nums[i]){
                m2=nums[i];
            }
            
        }
        return (m2-1)*(m1-1);
    }
}