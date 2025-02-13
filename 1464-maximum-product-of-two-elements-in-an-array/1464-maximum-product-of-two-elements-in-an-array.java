class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int n:nums){
            pq.add(n);
        }
        return((pq.poll()-1)*(pq.poll()-1));
    }
}