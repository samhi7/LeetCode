class Solution {
    public String[] createGrid(int m, int n) {
        char grid[][]=new char[m][n];
        for(int i=0;i<n;i++){
            grid[0][i]='.';
        }
        for(int i=0;i<m;i++){
            grid[i][n-1]='.';
        }
        String ans[]=new String[m];
        for(int i=0;i<m;i++){
            String a="";
            for(int j=0;j<n;j++){
                if(grid[i][j]!='.'){
                    grid[i][j]='#';
                }
                a+=grid[i][j];
            }
            ans[i]=a;
        }
        return ans;
    }
}