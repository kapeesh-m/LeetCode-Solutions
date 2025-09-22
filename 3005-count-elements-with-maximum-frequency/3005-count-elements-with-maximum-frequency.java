class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n=nums.length;
        int m=0;
        for(int i=0;i<n;i++){
            m=Math.max(m,nums[i]);
        }
        int[] freq=new int[m+1];
        for(int i=0;i<n;i++){
            freq[nums[i]]++;
        }
        int mafr=0;
        for(int i=0;i<m+1;i++){
            mafr=Math.max(mafr,freq[i]);
        }
        int s=0;
        for(int i=0;i<m+1;i++){
            if(freq[i]==mafr){
                s+=freq[i];
            }
        }
        return s;
    }
}