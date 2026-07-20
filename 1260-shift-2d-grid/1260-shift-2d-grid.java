class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n=grid[0].length;
        int m=grid.length;
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<m;i++){
            List<Integer> row=new ArrayList<>();
            for(int j=0;j<n;j++){
                row.add(0);
            }
            ans.add(row);
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int ind=i*n+j;
                int ne=(ind+k)%(m*n);
                ans.get(ne/n).set(ne%n,grid[i][j]);
            }
        }
        return ans;
    }
}