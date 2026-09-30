class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> hm=new HashMap<>();
        for(char c:s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        PriorityQueue<Character> pq=new PriorityQueue<>((a,b)->hm.get(b)-hm.get(a));
        for(char ch:hm.keySet()){
            pq.add(ch);
        }
        StringBuilder sb=new StringBuilder();
        while(!pq.isEmpty()){
            char a=pq.poll();
            for(int i=0;i<hm.get(a);i++){
                sb.append(a);
            }
        }
        return sb.toString();
        
    }
}