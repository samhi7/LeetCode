class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people,(a,b)->{
            if(a[0]!=b[0])
                return Integer.compare(b[0],a[0]);
            return Integer.compare(a[1],b[1]);
        });
       
        ArrayList<int[]> ans=new ArrayList<>();
        for(int x[]:people){
            ans.add(x[1],x);
        }

        return ans.toArray(new int[people.length][2]);
    }
}