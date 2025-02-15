class Solution {
    public int lastStoneWeight(int[] stones) {
       PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
       for(int n:stones){
        pq.add(n);
       } 
       while(pq.size()>1){
        int a=pq.poll();
        int b=pq.poll();
        if(a!=b){
            int c=a-b;
            pq.add(c);
        }
       }
       return pq.isEmpty()?0:pq.poll();
    }
}