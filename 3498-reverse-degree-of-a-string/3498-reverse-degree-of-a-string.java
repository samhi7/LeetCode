class Solution {
    public int reverseDegree(String s) {
        int i=1;
        int sum=0;
        int ind=0;
        for(char c:s.toCharArray()){
            ind=i*(26-(c-97));
            sum+=ind;
            i++;
        }
        return sum;
    }
}