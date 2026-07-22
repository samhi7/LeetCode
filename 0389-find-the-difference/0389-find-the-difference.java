class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer>hm=new HashMap<>();
        int n=s.length();
        for(char c:s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        for(char c:t.toCharArray()){
            if(!hm.containsKey(c)||hm.get(c)==0){
                return c;
            }
            hm.put(c,hm.get(c)-1);
        }

       return ' ';
        
    }
}