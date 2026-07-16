class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
       if(n==0)return 0;
       if(n==1)return nums[0];
       List<Integer> arr1=new ArrayList<>();
       List<Integer> arr2=new ArrayList<>();
       for(int i=0;i<n;i++){
        if(i!=0)arr1.add(nums[i]);
        if(i!=n-1)arr2.add(nums[i]);

       }
       return Math.max(solve(arr1),solve(arr2));
    }
    public int solve(List<Integer> nums){
         int n=nums.size();
        if(n==1)return nums.get(0);
        int prev=nums.get(0);
        int prev2=0;
        for(int i=1;i<n;i++){
            int pick=nums.get(i);
            if(i>1)pick+=prev2;
            int not=prev;
            int cur=Math.max(pick,not);
            prev2=prev;
            prev=cur;
        }
        return prev;
    }
}