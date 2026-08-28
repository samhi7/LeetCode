class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int x:nums){
            hs.add(x);
        }

        int ans=0;
        for(int x:hs){
            if(!hs.contains(x-1)){
                int count=1;
                while(hs.contains(x+count)){
                    count++;                    
                }
                ans=Math.max(ans,count);
               
            }
        }
        return ans;
    }
}