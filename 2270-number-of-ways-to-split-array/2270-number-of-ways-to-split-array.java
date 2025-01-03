class Solution {
    public int waysToSplitArray(int[] nums) {
        long tot=0;
        for(int i=0;i<nums.length;i++){
            tot+=nums[i];
        }
        long sumcur=0;
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            sumcur+=nums[i];
            if(sumcur>=tot-sumcur){
                count++;
            }
        }
        return count;
    }
}