class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        int left=0b00001111;
        int mid=0b11000011;
        int right=0b11110000;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int x[]:reservedSeats){
            if(x[1]>=2 && x[1]<=9){
                int seat=hm.containsKey(x[0])?hm.get(x[0]):0;
                seat=seat|(1<<(x[1]-2));
                hm.put(x[0],seat);
            }
        }
        int ans=(n-hm.size())*2;
        for(int x:hm.values()){
            if((x|left) == left || (x|mid)==mid || (x|right)==right){
                ans++;
            }
        }
        return ans;


    }
}