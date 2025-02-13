class Solution {
    public int[] numberGame(int[] nums) {
        int[] arr=new int[nums.length];
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int n:nums){
            pq.add(n);
        }
        int i=0;
        while(!pq.isEmpty()){
            int min1=pq.poll();
            int min2=pq.poll();
            arr[i++]=min2;
            arr[i++]=min1;
        }
        return arr;
    }
}