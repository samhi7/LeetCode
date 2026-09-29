class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            hs.add(nums[i]);
        }
        for(int i=0;i<=n;i++){
            if(hs.contains(i)){
                continue;
            }else{
                return i;
            }
        }
        return -1;
    }
}