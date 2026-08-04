class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=101;
        int max=0;
        int n=nums.length;
        HashSet<Integer> seen=new HashSet<>();
        for(int i=0;i<n;i++){
            if(min>nums[i]){
                min=nums[i];
            }if(max<nums[i]){
                max=nums[i];
            }
            seen.add(nums[i]);
        }
        if(n==max-min+1)return new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=min;i<=max;i++){
            if(seen.contains(i))continue;
            else{
                ans.add(i);
            }
        }
        return ans;
    }
}