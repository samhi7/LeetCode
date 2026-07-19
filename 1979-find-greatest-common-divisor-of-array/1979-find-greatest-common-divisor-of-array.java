class Solution {
    public int findGCD(int[] nums) {
        int n=nums.length;
        int max=Arrays.stream(nums).max().getAsInt();
        int min=Arrays.stream(nums).min().getAsInt();
        while(min!=0){
            int t=min;
            min=max%min;
            max=t;
        }
        return max;

    }
}